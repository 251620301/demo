package org.zzh.demo.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by 25162 on 2016/11/4.
 */
public final class StringUtil {
    public static boolean isEmpty(String str) {
        if(str != null){
            str =str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
