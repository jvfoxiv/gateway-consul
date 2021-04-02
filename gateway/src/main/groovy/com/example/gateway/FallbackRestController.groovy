package com.example.gateway

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
class FallbackRestController {
    @GetMapping("/api/fallback")
    Mono<String> getService1Msg() {
        return Mono.just("No response from service 1 and will be back shortly")
    }

}
