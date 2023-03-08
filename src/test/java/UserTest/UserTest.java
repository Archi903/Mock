package UserTest;

import org.example.DAO.Impl.UserDaoImpl;
import org.example.DAO.UserDao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private static final String CORRECT_NAME = "Jack";
    private static final String INCORRECT_NAME = "Jason";


    @Test
    public void shouldReturnName(){
        UserDao userDao = new UserDaoImpl();
        assertEquals(CORRECT_NAME, userDao.getUserByName(CORRECT_NAME).getName());
    }
    @Test
    public void shouldReturnNullIfNameNotExist(){
        UserDao userDao = new UserDaoImpl();
        assertNull(userDao.getUserByName(INCORRECT_NAME).getName());
    }

}
