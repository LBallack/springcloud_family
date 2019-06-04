package com.huawei.cn.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LPbService {
    @Autowired
    RestTemplate restTemplate;

    public String lpbService(String name) {
        return restTemplate.getForObject("http://Service-lpb/lpb?name=" + name, String.class);
    }
}
