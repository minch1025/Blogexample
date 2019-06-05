package biz.km2y.blogexamples.repository

import biz.km2y.blogexamples.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {

}