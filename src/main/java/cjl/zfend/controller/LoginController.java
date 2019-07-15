package cjl.zfend.controller;
import cjl.zfend.entity.User;
import cjl.zfend.serviceimpl.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    private UserServiceImp userServiceImp;
    @RequestMapping("/login")
//    @ModelAttribute注解的实体类接收前端发来的数据格式需要为"x-www-form-urlencoded"，
//    @RequestBody注解的实体类接收前端的数据格式为JSON(application/json)格式。
//   （若是使用@ModelAttribute接收application/json格式，虽然不会报错，但是值并不会自动填入）
    public User login(@ModelAttribute User user, HttpServletRequest request){
      User user1= userServiceImp.selectUser(user.getName());
    return  user1;
    }
}
