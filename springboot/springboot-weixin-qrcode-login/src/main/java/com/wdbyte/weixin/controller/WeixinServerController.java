package com.wdbyte.weixin.controller;

import com.wdbyte.weixin.service.WeixinUserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author https://www.wdbyte.com
 * @date 2024/01/16
 */
@Slf4j
@RestController
public class WeixinServerController {

    @Autowired
    private WeixinUserService weixinUserService;

    @GetMapping(value = "/api/v1/weixin/check")
    public String weixinCheck(HttpServletRequest request) {
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");

        if (StringUtils.isEmpty(signature) || StringUtils.isEmpty(timestamp) || StringUtils.isEmpty(nonce)) {
            return "";
        }
        weixinUserService.checkSignature(signature, timestamp, nonce);
        return echostr;
    }

    @PostMapping(value = "/api/v1/weixin/check")
    public String weixinMsg(@RequestBody String requestBody, @RequestParam("signature") String signature,
                            @RequestParam("timestamp") String timestamp, @RequestParam("nonce") String nonce) {

        log.debug("requestBody:{}", requestBody);
        log.debug("signature:{}", signature);
        log.debug("timestamp:{}", timestamp);
        log.debug("nonce:{}", nonce);

        weixinUserService.checkSignature(signature, timestamp, nonce);
        return weixinUserService.handleWeixinMsg(requestBody);
    }


}
