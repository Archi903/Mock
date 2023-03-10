package UserTest;

import org.example.DAO.Impl.UserDaoImpl;
import org.example.DAO.UserDao;
import org.example.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private static final User CORRECT_NAME = new User ("Jack");
    private static final User INCORRECT_NAME =new User ( "Jason");
    private static final List <User> users = List.of(CORRECT_NAME, new User("Alison"), new User("John"));
    private static final UserDao userDao = new UserDaoImpl();

    @Test
    public void shouldReturnName(){
        assertEquals(CORRECT_NAME.getName(), userDao.getUserByName(CORRECT_NAME).getName());
    }
    @Test
    public void shouldReturnNullIfNameNotExist(){
        UserDao userDao = new UserDaoImpl();
        assertNull(userDao.getUserByName(INCORRECT_NAME));
    }

}
