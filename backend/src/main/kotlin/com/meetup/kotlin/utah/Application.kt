package com.meetup.kotlin.utah

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import sample.Platform

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, port = 8080) {
        routing {

            get("/") {
                call.respondText("Hello World ${Platform.name}!", ContentType.Text.Plain)
            }
            get("/demo") {
                call.respondText("HELLO WORLD!")
            }
        }
    }
    server.start(wait = true)
}
