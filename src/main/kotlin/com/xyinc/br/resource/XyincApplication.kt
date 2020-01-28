package com.xyinc.br.xyinc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.SpringApplication

@SpringBootApplication
open class XyincApplication

fun main(args: Array<String>) {
	SpringApplication.run(XyincApplication::class.java,*args)
}