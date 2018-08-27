package com.microservices.chapter2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Chapter2Application{
    @Bean
    @ConditionalOnExpression("#{'\${service.type}'=='simple'}")
    fun exampleService() : ServiceInterface = ExampleService()

    @Bean
    @ConditionalOnExpression("#{'\${service.type}'=='advance'}")
    fun advanceService() : ServiceInterface = AdvanceService()

    fun main(args: Array<String>) {
        runApplication<Chapter2Application>(*args)
    }
}

