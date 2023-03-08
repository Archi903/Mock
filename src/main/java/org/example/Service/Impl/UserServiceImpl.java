package org.example.Service.Impl;

import org.example.DAO.UserDao;
import org.example.Service.UserService;
import org.example.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public boolean checkUserExist(User user) {
        List<User> userList = new UserServiceImpl(userDao).userDao.findAllUsers();
        return userList.contains(user);
    }
}
