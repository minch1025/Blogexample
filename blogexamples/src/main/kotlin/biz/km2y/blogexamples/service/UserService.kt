package biz.km2y.blogexamples.service

import biz.km2y.blogexamples.model.User
import biz.km2y.blogexamples.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
open class UserService @Autowired constructor(private val userRepository: UserRepository){
    fun findAllUser(): MutableList<User> = userRepository.findAll()
}