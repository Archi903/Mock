package UserTestMockito;

import org.example.DAO.UserDao;
import org.example.Service.Impl.UserServiceImpl;
import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    private static final User CORRECT_NAME = new User( "Jack");
    private static final User INCORRECT_NAME = new User("Jason");

    @Mock
    UserDao userDao;

    @InjectMocks
    UserServiceImpl userService;

    private static final List<User> users = List.of(CORRECT_NAME, new User("Max"), new User("Josh"), new User("Megan"));

    @Test
    void shouldReturnFalse() {
        when(userDao.findAllUsers()).thenReturn(users);

        Assertions.assertEquals(users, userDao.findAllUsers());
        Assertions.assertFalse(userService.checkUserExist(INCORRECT_NAME));
    }

    @Test
    void shouldReturnTrue() {
        when(userDao.findAllUsers()).thenReturn(users);

        Assertions.assertEquals(users, userDao.findAllUsers());
        Assertions.assertTrue(userService.checkUserExist(CORRECT_NAME));
    }
}
