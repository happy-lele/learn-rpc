package com.le.rpc.enity;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 消费者向提供者发送的请求对象
 * @Author happy_le
 * @date 2021/2/20 上午11:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RpcRequest implements Serializable {

    /**
     * 请求号
     * */
    private String requestId;

    /**
     * 待调用接口的名称
     * */
    private String interfaceName;

    /**
     * 待调用方法的名称
     * */
    private String methodName;

    /**
     * 调用方法参数
     * */
    private Object[] parameters;

    /**
     * 调用方法的参数类型
     * */
    private Class<?>[] paramTypes;

    /**
     * 是否是心跳包
     * */
    private Boolean heartBeat;

}
