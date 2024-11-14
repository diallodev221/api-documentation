package com.diallodev.api_documentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String, String> greeting() {
        return Collections.singletonMap("message", "Hello, world");
    }


}
