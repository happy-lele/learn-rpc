package com.le.test;

import com.le.rpc.api.ByeService;
import com.le.rpc.api.HelloObject;
import com.le.rpc.api.HelloService;
import com.le.rpc.serializer.CommonSerializer;
import com.le.rpc.transport.netty.client.NettyClient;
import com.le.rpc.transport.socket.RpcClient;
import com.le.rpc.transport.socket.RpcClientProxy;

/**
 * 测试用Netty消费者
 * @Author happy_le
 * @date 2021/2/20 下午2:19
 */
public class NettyTestClient {

    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        HelloObject object = new HelloObject(12, "This is a message");
        String res = helloService.hello(object);
        System.out.println(res);
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }

}
