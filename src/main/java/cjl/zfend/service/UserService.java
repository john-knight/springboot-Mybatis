package cjl.zfend.service;
import cjl.zfend.entity.User;
import org.springframework.stereotype.Service;
@Service
public interface UserService {
    public User selectUser(String name);
}
