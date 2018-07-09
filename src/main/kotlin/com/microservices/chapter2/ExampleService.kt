package com.microservices.chapter2

import org.springframework.stereotype.Service

@Service
public class ExampleService {
    fun getHello(name : String) = "Hello $name"
}