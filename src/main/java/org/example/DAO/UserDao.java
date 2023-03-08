package org.example.DAO;

import org.example.User;

import java.util.List;

public interface UserDao {


User getUserByName (String name);

List<User> findAllUsers ();

}
