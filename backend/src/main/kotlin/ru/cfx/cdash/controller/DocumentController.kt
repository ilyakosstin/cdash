package ru.cfx.cdash.controller

import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.HttpClientErrorException
import ru.cfx.cdash.exception.ResourceNotFoundException
import ru.cfx.cdash.repository.TextFragmentRepository

@RequestMapping("/t")
@RestController("")
class DocumentController(
    private val textFragmentRepository: TextFragmentRepository,
) {

    @GetMapping("/fragment/{fragmentId}")
    fun getFragmentById(@PathVariable fragmentId: Long): String {
        return textFragmentRepository.findByIdOrNull(fragmentId)?.body ?: throw ResourceNotFoundException("Fragment with id = ${fragmentId} was not found")
    }


}