package br.com.resende.restkotlinspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestKotlinSpringbootApplication

fun main(args: Array<String>) {
	runApplication<RestKotlinSpringbootApplication>(*args)
}
