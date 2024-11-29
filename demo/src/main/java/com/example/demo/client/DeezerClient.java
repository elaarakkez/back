package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "deezerClient", url = "https://api.deezer.com")
public interface DeezerClient {
    @GetMapping("/search")
    ResponseEntity<Object> searchMusic(@RequestParam("q") String query);
}
