package org.example.DAO.Impl;

import org.example.DAO.UserDao;
import org.example.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    public List<User> users = new ArrayList<>();
    public UserDaoImpl(){
        User user1 = new User("Jack");
        User user2 = new User("John");
        User user3 = new User("Alice");
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List findAllUsers() {
        return users;
    }


}
