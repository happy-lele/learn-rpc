package com.le.rpc.transport.socket;

import com.le.rpc.enity.RpcRequest;
import com.le.rpc.serializer.CommonSerializer;

/**
 * 客户端类通用接口
 * @Author happy_le
 * @date 2021/2/20 下午1:55
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}
