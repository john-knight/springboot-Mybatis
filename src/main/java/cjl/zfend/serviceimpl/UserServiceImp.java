package cjl.zfend.serviceimpl;

import cjl.zfend.dao.UserDao;
import cjl.zfend.entity.User;
import cjl.zfend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service
public class UserServiceImp implements UserService {
    //   这边一直注红报错，但是不影响项目正常运转，不知为何
    @Autowired
    UserDao userDao;
    @Override
    public User selectUser(String name) {
       User user= userDao.selectUser(name);
        return user;
    }
}
