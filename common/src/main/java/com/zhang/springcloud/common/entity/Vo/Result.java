package com.zhang.springcloud.common.entity.Vo;

import lombok.Getter;

import java.time.Instant;
import java.time.ZonedDateTime;

@Getter
public class Result<T> {
    public static final String Success_Code="000000";
    public static final String  Success_Message="处理成功";

    /**
     * 返回结果
     */
    private String code;

    /**
     * 返回消息
     *
     */
    private String msg;

    /**
     * 时间
     */
    private Instant timestamp;

    private T data;

    public Result(String Code,String Message,T data){
        this.code=Code;
        this.msg=Message;
        this.data=data;
        this.timestamp= ZonedDateTime.now().toInstant();
    }
    public static Result success(Object data){
    return new Result(Success_Code,Success_Message,data);
    }
}
