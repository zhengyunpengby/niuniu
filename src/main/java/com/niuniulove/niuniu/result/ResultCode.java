package com.niuniulove.niuniu.result;

public enum ResultCode {

    SUCCESS("0000", "请求处理成功"),
    ERROR_FORMAT("4001", "请求参数格式错误"),
    ERROR_REJECT("4003", "请求被拒绝"),
    ERROR_DATA_ANALYZE("5001", "数据解析失败"),
    ERROR_SYSTEM_CALL("5002", "内部系统调用异常"),
    ERROR_DB_OPERATE("5003", "数据库操作异常"),
    ERROR_NO_DEFINE("9999", "请求处理未知异常")
    ;

    private String code;
    private String desc;

    private ResultCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
