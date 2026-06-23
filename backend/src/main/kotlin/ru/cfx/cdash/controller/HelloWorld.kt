package ru.cfx.cdash.controller

import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import ru.cfx.cdash.entity.User
import ru.cfx.cdash.repository.UserRepository

@RestController
class HelloWorld(
    private val userRepository: UserRepository,
) {

    

    @GetMapping("/hello_world")
    fun helloWorld(): String {
        return "Hello world"
    }

    @GetMapping("/user/{user_id}")
    fun getUserName(@PathVariable("user_id") userId: Long): String {
        return userRepository.findByIdOrNull(userId)?.username ?: "FUCK NIGGERRS";
    }


}