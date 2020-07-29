package com.xinyet.mybatisplustest.communication;

/**
 * @author shengWeiMao
 * @date 2020/7/29 16:24
 * @Description 异常的枚举类
 * @return
 */
public enum HttpExceptionEnum {

    /**
     * 服务器内部错误
     */
    SERVER_ERROR(500, "服务器异常"),

    /**
     * token异常
     */
    TOKEN_EXPIRED(101, "token过期"),
    TOKEN_ERROR(102, "token验证失败"),

    /**
     * 签名异常
     */
    SIGN_ERROR(103, "签名验证失败"),
    SIGN_PARAM_LOSE(104, "参数没有全部签名"),

    /**
     * jwt鉴权认证 帐号密码错误
     */
    AUTH_REQUEST_ERROR(105, "鉴权账号密码错误"),

    /**
     * 文件上传异常
     */
    FILE_READING_ERROR(106, "FILE_READING_ERROR!"),
    FILE_NOT_FOUND(107, "FILE_NOT_FOUND!"),

    /**
     * API异常
     */
    API_EXPIRED(108, "API过期"),
    API_SIGN_TIME_ERROR(109, "请求时间异常，需要和服务器时间保持10分以内"),
    API_AUTH_ERROR(303, "api没有访问权限"),

    /**
     * 用户登录 账号或密码错误
     */
    USER_LOGIN_ERROR(301, "账号或密码错误"),
    USER_LOGINACCOUNT_ERROR(302, "登录账号信息错误"),
    PARAM_NOT_NULL(440, "必填参数为空"),
    PARAM_TYPE_NULL(441, "参数类型错误"),
    API_NOT_FIND(442, "API接口不存在");

    HttpExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;

    private String message;

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
