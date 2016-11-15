package org.zzh.demo.helper;

import org.zzh.demo.ConfigConstant;
import org.zzh.demo.util.PropsUtil;

import java.util.Properties;

/**
 * Created by 25162 on 2016/11/7.
 */
public class ConfigHelper {
    private static final Properties CONFIG_PROPS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);

    public static String getJdbcDriver() {
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_DRIVER);
    }

    public static String getJdbcUrl() {
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_URL);
    }

    public static String getJdbcUsernam() {
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_USERNAME);
    }

    public static String getJdbcPassword() {
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.JDBC_PASSWORD);
    }

    public static String getAppBasePackage() {
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.APP_BASE_PACKAGE);
    }

    public static String getAppJspPath() {
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.APP_JSP_PACKAGE);
    }

    public static String getAppAssetPath() {
        return PropsUtil.getString(CONFIG_PROPS,ConfigConstant.APP_ASSET_PATH);
    }
}
