package com.le.rpc.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例工厂
 * @Author happy_le
 * @date 2021/2/20 下午12:05
 */
public class SingletonFactory {

    private static Map<Class, Object> objectMap = new HashMap<>();

    public SingletonFactory() {
    }

    public static <T> T getInstance(Class<T> clazz) {
        Object instance = objectMap.get(clazz);
        synchronized (clazz) {
            if (instance == null) {
                try {
                    instance = clazz.newInstance();
                    objectMap.put(clazz, instance);
                } catch (IllegalAccessException | InstantiationException e) {
                    throw new RuntimeException(e.getMessage(), e);
                }
            }
        }
        return clazz.cast(instance);
    }
}
