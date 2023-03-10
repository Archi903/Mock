package org.example.DAO;

import org.example.User;

import java.util.List;

public interface UserDao {



    User getUserByName(User name);

    List<User> findAllUsers ();

}
