package com.le.test;

import com.le.rpc.annotation.Service;
import com.le.rpc.api.ByeService;

/**
 * @Author happy_le
 * @date 2021/2/20 下午2:20
 */
@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "bye, " + name;
    }
}
