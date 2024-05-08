package com.eunbyeol.helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EunbyeolApplication

fun main(args: Array<String>) {
	runApplication<EunbyeolApplication>(*args)
}
