package com.le.rpc.registry;

import java.net.InetSocketAddress;

/**
 * 服务发现接口
 * @Author happy_le
 * @date 2021/2/20 下午1:44
 */
public interface ServiceDiscovery {
    /**
     * 根据服务名称查找服务实体
     *
     * @param serviceName 服务名称
     * @return 服务实体
     */
    InetSocketAddress lookupService(String serviceName);

}
