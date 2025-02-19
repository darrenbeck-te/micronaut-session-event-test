package com.testevolve.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.session.Session

@Controller("/")
class HelloController {
    @Get
    fun hello(session: Session): HttpResponse<String> {
        return HttpResponse.ok("Hello from session: ${session.id}")
    }
}