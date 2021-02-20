package com.le.rpc.exception;

/**
 * 序列化异常
 * @Author happy_le
 * @date 2021/2/20 下午12:05
 */
public class SerializeException extends RuntimeException{
    public SerializeException(String msg) {
        super(msg);
    }
}
