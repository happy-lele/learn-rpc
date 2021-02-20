package com.le.rpc.transport.socket;

import com.le.rpc.serializer.CommonSerializer;

/**
 * 服务器类通用接口
 * @Author happy_le
 * @date 2021/2/20 下午1:55
 */
public interface RpcServer {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    void start();

    <T> void publishService(T service, String serviceName);

}
