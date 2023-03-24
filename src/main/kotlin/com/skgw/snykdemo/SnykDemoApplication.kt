package com.skgw.snykdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SnykDemoApplication

fun main(args: Array<String>) {
	runApplication<SnykDemoApplication>(*args)
}
