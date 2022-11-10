package com.example.prueba

import org.jetbrains.annotations.TestOnly
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PruebaApplication
@TestOnly

fun main(args: Array<String>) {
	runApplication<PruebaApplication>(*args)
}


