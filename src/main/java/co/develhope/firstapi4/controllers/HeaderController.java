package co.develhope.firstapi4.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HeaderController{

    @GetMapping("/headers")
    public Map<String, String> getHostInfo(@RequestHeader HttpHeaders headers){
        Map<String, String> hMap = new HashMap<>();
        hMap.put("hostName", headers.getHost().getHostName());
        hMap.put("hostPort", headers.getHost().getPort() + "");
        return hMap;
    }
}