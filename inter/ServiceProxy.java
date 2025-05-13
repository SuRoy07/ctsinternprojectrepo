package com.user.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="ProductApp",url="http://webapps.tekstac.com:8091/")
public interface ServiceProxy {

@GetMapping(value="/getInfo")
public String getDetails();
}
