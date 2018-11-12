package com.servise;

import com.dao.UserMapper;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int insert(User record){
      return   userMapper.insert(record);
    }
public User insertUser(User user){
        return userMapper.insertUser(user);
}

}
