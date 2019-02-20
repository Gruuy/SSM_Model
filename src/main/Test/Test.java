import com.Gruuy.entity.User;
import com.Gruuy.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")
public class Test {
    @Resource
    private UserService userService;
    @org.junit.Test
    public void Test(){
        List<User> userList=userService.getAllUser();
        System.out.println(userList.toString());
    }
}
