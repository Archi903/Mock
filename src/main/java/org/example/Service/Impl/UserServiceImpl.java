package org.example.Service.Impl;

import org.example.DAO.UserDao;
import org.example.Service.UserService;
import org.example.User;

import java.util.List;
import java.util.Objects;

public class UserServiceImpl implements UserService {

    public UserDao userDao;

    @Override
    public boolean checkUserExist(User user) {
        List<User> userList = userDao.findAllUsers();
        return userList.contains(user);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserServiceImpl that = (UserServiceImpl) o;
        return Objects.equals(userDao, that.userDao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userDao);
    }
}
