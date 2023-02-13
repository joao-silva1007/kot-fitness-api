package pt.fitness.jms.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotFitnessApiApplication

fun main(args: Array<String>) {
    runApplication<KotFitnessApiApplication>(*args)
}
