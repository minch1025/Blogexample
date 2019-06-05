package biz.km2y.blogexamples.controller

import biz.km2y.blogexamples.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class UserController @Autowired constructor(private val userService: UserService) {
    @RequestMapping("/")
    fun root(): ModelAndView {
        return users()
    }

    @RequestMapping("/users")
    fun users(): ModelAndView = ModelAndView("/user").apply { addObject("users", userService.findAllUser()) }
}