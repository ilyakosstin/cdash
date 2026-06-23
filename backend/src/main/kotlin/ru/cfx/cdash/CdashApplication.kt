package ru.cfx.cdash

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CdashApplication


fun main(args: Array<String>) {
	runApplication<CdashApplication>(*args)
}
