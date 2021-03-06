package com.example.quickstart.service.impl;

import com.example.quickstart.dao.IUserDao;
import com.example.quickstart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional  //启用事务
    public void saveUser(User user) {
        userDao.saveUserById(user);
    }
}
