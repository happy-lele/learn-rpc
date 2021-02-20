package com.le.rpc.exception;

import com.le.rpc.enumeration.RpcError;

/**
 * RPC调用异常
 * @Author happy_le
 * @date 2021/2/20 下午12:02
 */
public class RpcException extends RuntimeException {

    public RpcException(RpcError error, String detail) {
        super(error.getMessage() + ": " + detail);
    }

    public RpcException(String message, Throwable cause) {
        super(message, cause);
    }

    public RpcException(RpcError error) {
        super(error.getMessage());
    }
}
