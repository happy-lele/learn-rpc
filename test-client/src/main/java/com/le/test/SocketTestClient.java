package com.le.test;

import com.le.rpc.api.ByeService;
import com.le.rpc.api.HelloObject;
import com.le.rpc.api.HelloService;
import com.le.rpc.serializer.CommonSerializer;
import com.le.rpc.transport.socket.RpcClientProxy;
import com.le.rpc.transport.socket.client.SocketClient;

/**
 * 测试用消费者（客户端）
 * @Author happy_le
 * @date 2021/2/20 下午2:19
 */
public class SocketTestClient {

    public static void main(String[] args) {
        SocketClient client = new SocketClient(CommonSerializer.KRYO_SERIALIZER);
        RpcClientProxy proxy = new RpcClientProxy(client);
        HelloService helloService = proxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = proxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
