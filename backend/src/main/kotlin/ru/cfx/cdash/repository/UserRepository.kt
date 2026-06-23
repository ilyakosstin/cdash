package ru.cfx.cdash.repository

import org.springframework.data.repository.CrudRepository
import ru.cfx.cdash.entity.User

interface UserRepository : CrudRepository<User, Long> {
}