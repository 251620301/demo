package org.zzh.demo.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by 25162 on 2016/11/14.
 */
public final class ArrayUtil {
    public static boolean isNotEmpty(Object[] array) {
            return !ArrayUtils.isEmpty(array);
    }

    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
