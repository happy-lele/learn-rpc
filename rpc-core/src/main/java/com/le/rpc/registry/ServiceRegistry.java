package com.le.rpc.registry;

import java.net.InetSocketAddress;

/**
 * 服务注册接口
 * @Author happy_le
 * @date 2021/2/20 下午1:44
 */
public interface ServiceRegistry {
    /**
     * 将一个服务注册进注册表
     *
     * @param serviceName 服务名称
     * @param inetSocketAddress 提供服务的地址
     */
    void register(String serviceName, InetSocketAddress inetSocketAddress);
}