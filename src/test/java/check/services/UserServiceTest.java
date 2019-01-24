package check.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService; // class need to test

    @MockBean
    private CreditSystemService creditSystemService;

    @Test
    public void testService() {
        int userid = 10;
        int expectedCredit = 100;
        given(this.creditSystemService.getUserCredit(anyInt())).willReturn(expectedCredit);
        int credit = userService.getCredit(userid);
        assertEquals(expectedCredit, credit);
    }
}