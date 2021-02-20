package com.le.test;

import com.le.rpc.annotation.ServiceScan;
import com.le.rpc.serializer.CommonSerializer;
import com.le.rpc.transport.netty.server.NettyServer;
import com.le.rpc.transport.socket.RpcServer;

/**
 * 测试用Netty服务提供者（服务端）
 * @Author happy_le
 * @date 2021/2/20 下午2:21
 */
@ServiceScan
public class NettyTestServer {

    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.PROTOBUF_SERIALIZER);
        server.start();
    }

}
