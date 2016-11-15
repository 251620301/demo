package org.zzh.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by 25162 on 2016/11/15.
 */
public final class StreamUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(StreamUtil.class);

    public static String getString(InputStream is){
        StringBuilder sb = new StringBuilder();
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = reader.readLine())!=null){
                sb.append(line);
            }
        }catch (Exception e){
            LOGGER.error("get string failed",e);
            throw new RuntimeException();
        }
        return sb.toString();
    }

}
