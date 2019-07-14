package cjl.zfend.dao;

import cjl.zfend.entity.User;
import org.apache.ibatis.annotations.Mapper;
//使用@Repository需要手动添加对应的mapper.xml文件（应该指的是全局的mybatis配置文件)
@Mapper
public interface UserDao {
   User selectUser(int id);
}
