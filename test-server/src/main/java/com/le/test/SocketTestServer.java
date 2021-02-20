package com.le.test;

import com.le.rpc.annotation.ServiceScan;
import com.le.rpc.serializer.CommonSerializer;
import com.le.rpc.transport.socket.RpcServer;
import com.le.rpc.transport.socket.server.SocketServer;

/**
 * 测试用服务提供方（服务端）
 * @Author happy_le
 * @date 2021/2/20 下午2:21
 */
@ServiceScan
public class SocketTestServer {

    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }

}
