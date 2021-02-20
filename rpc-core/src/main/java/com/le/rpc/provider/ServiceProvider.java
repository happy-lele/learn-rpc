package com.le.rpc.provider;

/**
 * 保存和提供服务实例对象
 * @Author happy_le
 * @date 2021/2/20 下午1:43
 */
public interface ServiceProvider {

    <T> void addServiceProvider(T service, String serviceName);

    Object getServiceProvider(String serviceName);
}
