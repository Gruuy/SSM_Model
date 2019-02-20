package com.Gruuy.service.serviceImpl;

import com.Gruuy.dao.UserDao;
import com.Gruuy.entity.User;
import com.Gruuy.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUser() {
        return userDao.getAll();
    }
}
