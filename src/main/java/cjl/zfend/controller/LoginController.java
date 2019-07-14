package cjl.zfend.controller;

import cjl.zfend.dao.UserDao;
import cjl.zfend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    private UserDao userDao;
    @RequestMapping("/login")
    public User login(@RequestParam String name){
      User user1= userDao.selectUser(name);
    return  user1;
    }
}
