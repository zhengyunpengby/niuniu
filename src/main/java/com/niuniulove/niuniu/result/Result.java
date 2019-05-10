package com.niuniulove.niuniu.result;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

public abstract class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 0000	请求处理成功
     * 4001	请求参数格式错误
     * 4003	请求被拒绝
     * 5001	数据解析失败
     * 5002	内部系统调用异常
     * 5003	数据库操作异常
     * 9999	请求处理未知异常
     */

    /**
     * @return 返回码
     */
    private String code;

    /**
     * @return 返回码描述
     */
    private String desc;

    public String getCode() {
        return code;
    }

    public Result setCode(String code) {
        this.code = code;
        return this;
    }

    public String getDesc() {
        if (desc == null)
            return "";

        return desc;
    }

    public Result setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public Result setResult(ResultCode code) {
        this.code = code.getCode();
        this.desc = code.getDesc();
        return this;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.DEFAULT_STYLE, true, true);
    }
}
