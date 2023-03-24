package com.skgw.snykdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    private fun test(@RequestParam("comment") comment: String): Map<String, Any> {
        return mapOf("comment" to comment, "length" to comment.length)
    }

}
