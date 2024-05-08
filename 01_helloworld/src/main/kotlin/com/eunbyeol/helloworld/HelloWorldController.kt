package com.eunbyeol.helloworld

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Controller
class HelloWorldController {
    @GetMapping("/helloworld") // 해당 URL GET 요청 메소드 정의
    @ResponseBody // RESTful HTTP
    fun hello(): String {
        return "Hello, World!" // Hello World 문자열 반환
    }
}