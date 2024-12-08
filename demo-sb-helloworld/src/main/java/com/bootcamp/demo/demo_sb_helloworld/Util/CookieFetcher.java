package com.bootcamp.demo.demo_sb_helloworld.Util;

import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class CookieFetcher {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://fc.yahoo.com";

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        HttpHeaders headers = response.getHeaders();

        // Get the Set-Cookie header
        List<String> cookies = headers.get(HttpHeaders.SET_COOKIE);
        System.err.println(cookies == null);
        if (cookies != null) {
            for (String cookie : cookies) {
                System.err.println("set-cookie: " + cookie);
            }
        }
        System.err.println(" end of method ");
    }
}