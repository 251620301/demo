package org.zzh.demo.bean;

import org.zzh.demo.util.CastUtil;

import java.util.Map;

/**
 * Created by 25162 on 2016/11/14.
 */
public class Param {

    private Map<String,Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    public Map<String,Object> getMap() {
        return paramMap;
    }
}
