package com.wangcai.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

import com.wangcai.api.service.MemberService;

@Component
@FeignClient("member")
public interface MemberServiceFegin extends MemberService {

}
