package com.huawei.cn.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayLpb(String name) {
        return "sorry "+name;
    }
}
