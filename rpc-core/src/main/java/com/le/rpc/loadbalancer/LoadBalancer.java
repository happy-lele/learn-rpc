package com.le.rpc.loadbalancer;

import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.List;

/**
 * @Author happy_le
 * @date 2021/2/20 下午12:39
 */
public interface LoadBalancer {

    Instance select(List<Instance> instances);

}
