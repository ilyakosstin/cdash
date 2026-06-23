package ru.cfx.cdash.repository

import org.springframework.data.repository.CrudRepository
import ru.cfx.cdash.entity.TextFragment

interface TextFragmentRepository : CrudRepository<TextFragment, Long> {
}