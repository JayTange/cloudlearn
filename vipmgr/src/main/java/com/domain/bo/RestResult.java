package com.domain.bo;

import com.constant.RestCode;
import org.springframework.ui.ModelMap;


public class RestResult {

    /**
     * 成功返回
     * @return
     */
    public static ModelMap Success() {
        ModelMap mp = new ModelMap();
        mp.put("code", RestCode.SUCCESS.code);
        mp.put("msg", RestCode.SUCCESS.msg);
        mp.put("data", "");
        return mp;
    }

    /**
     * 一般成功 统一返回
     */
    public static ModelMap Success(Object obj) {
        ModelMap mp = new ModelMap();
        mp.put("code", RestCode.SUCCESS.code);
        mp.put("msg", RestCode.SUCCESS.msg);
        mp.put("data", obj);
        return mp;
    }

    /**
     * 自定义成功消息
     */
    public static ModelMap Success(String msg, Object obj) {
        ModelMap map = new ModelMap();
        map.put("code", RestCode.SUCCESS.code);
        map.put("msg", msg);
        map.put("data", obj);
        return map;
    }

    /**
     * 自定义成功返回
     */
    public static ModelMap Success(int code, String msg, Object obj){
        ModelMap map = new ModelMap();
        map.put("code", code);
        map.put("msg", msg);
        map.put("data", obj);
        return map;
    }

    /**
     * 一般错误 统一返回
     */
    public static ModelMap Error(RestCode restCode) {
        ModelMap map = new ModelMap();
        map.put("code", restCode.code);
        map.put("msg", restCode.msg);
        return map;
    }

    /**
     * 自定义错误信息
     */
    public static ModelMap Error(int code, String msg) {
        ModelMap mp = new ModelMap();
        mp.put("code", code);
        mp.put("msg", msg);
        return mp;
    }
}
