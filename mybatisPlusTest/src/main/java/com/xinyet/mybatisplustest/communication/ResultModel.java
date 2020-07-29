package com.xinyet.mybatisplustest.communication;

/**
 * 定义通用的请求返回对象
 *
 * @param <T>
 */
public class ResultModel<T> {
    //code=1为访问正常，否则异常
    private int code = 1;
    private String message = "success";
    private T data;
    private Object attrs;//额外的一些属性

    public ResultModel() {
    }

    public static <T> ResultModel<T> success(T data) {
        return new ResultModel<T>(data);
    }

    public static <T> ResultModel<T> error(HttpExceptionEnum error) {
        return new ResultModel<T>(error);
    }

    public static <T> ResultModel<T> error(int code, String errorMessage) {
        return new ResultModel<T>(code, errorMessage);
    }

    public ResultModel(T data) {
        this.data = data;
    }

    public ResultModel(HttpExceptionEnum error) {
        this.code = error.getCode();
        this.message = error.getMessage();
    }

    public ResultModel(int code, Throwable error) {
        this.code = code;
        this.message = error.getMessage();
    }

    public ResultModel(Throwable error) {
        this.code = 0;
        this.message = error.getMessage();
    }

    public ResultModel(int code, String errorMessage) {
        addErrorMessage(code, errorMessage);
    }

    public void addErrorMessage(String errorMessage) {
        addErrorMessage(0, errorMessage);
    }

    public void addErrorMessage(int errorCode, String errorMessage) {
        this.code = errorCode;
        this.message = errorMessage;
    }

    /**
     * 请求状态码
     *
     * @return
     * @example 1
     */
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 请求状态描述
     *
     * @return
     * @example success
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 返回的数据
     *
     * @return
     */
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 其他返回属性
     *
     * @return
     */
    public Object getAttrs() {
        return attrs;
    }

    public void setAttrs(Object attrs) {
        this.attrs = attrs;
    }
}
