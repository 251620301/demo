package org.zzh.demo.helper;

import org.zzh.demo.annotation.Inject;
import org.zzh.demo.util.ArrayUtil;
import org.zzh.demo.util.CollectionUtil;
import org.zzh.demo.util.ReflectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by 25162 on 2016/11/14.
 */
public class IocHelper {
    static{
        Map<Class<?>,Object> beanMap = BeanHelper.getBeanMap();
        if(CollectionUtil.isNotEmpty(beanMap)) {
            for (Map.Entry<Class<?>,Object> beanEntry:beanMap.entrySet()){
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                Field[] beanFields = beanClass.getFields();
                if(ArrayUtil.isNotEmpty((beanFields))) {
                    for (Field beanField:beanFields) {
                        if(beanField.isAnnotationPresent(Inject.class)){
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if(beanFieldInstance!=null){
                                ReflectionUtil.setField(beanInstance,beanField,beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
