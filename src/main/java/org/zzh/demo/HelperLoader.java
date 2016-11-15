package org.zzh.demo;

import org.zzh.demo.helper.BeanHelper;
import org.zzh.demo.helper.ClassHelper;
import org.zzh.demo.helper.ControllerHelper;
import org.zzh.demo.helper.IocHelper;
import org.zzh.demo.util.ClassUtil;

/**
 * Created by 25162 on 2016/11/14.
 */
public class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
            ClassHelper.class,
            BeanHelper.class,
            IocHelper.class,
            ControllerHelper.class
        };
        for (Class<?> cls:classList) {
            ClassUtil.loadClass(cls.getName(),false);
        }
    }
}
