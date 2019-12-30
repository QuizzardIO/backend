package io.quizzard.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QuizzardApplication

fun main(args: Array<String>) {
	runApplication<QuizzardApplication>(*args)
}
