package org.zzh.demo.helper;

import org.zzh.demo.annotation.Action;
import org.zzh.demo.bean.Handler;
import org.zzh.demo.bean.Request;
import org.zzh.demo.util.ArrayUtil;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by 25162 on 2016/11/14.
 */
public final class ControllerHelper {
    private static final Map<Request,Handler> ACTION_MAP = new HashMap<Request, Handler>();

    static {
        Set<Class<?>> controllerClassSet = ClassHelper.getControllerClassSet();
        for (Class<?> controllerClass : controllerClassSet) {
            Method[] methods = controllerClass.getDeclaredMethods();
            if (ArrayUtil.isNotEmpty(methods)) {
                for (Method method:methods) {
                    if (method.isAnnotationPresent(Action.class)) {
                        Action action = method.getAnnotation(Action.class);
                        String mapping = action.value();
                        if (mapping.matches("\\w+:/\\w*")) {
                            String[] array = mapping.split(":");
                            String requestMethod = array[0];
                            String requestPath = array[1];
                            Request request = new Request(requestMethod,requestPath);
                            Handler handler = new Handler(controllerClass,method);
                            ACTION_MAP.put(request,handler);
                        }
                    }
                }
            }
        }
    }

    public static Handler getHandler(String requestMethod,String requestPath) {
        Request request = new Request(requestMethod,requestPath);
        return ACTION_MAP.get(request);
    }
}
