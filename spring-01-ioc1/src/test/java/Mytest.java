import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;

public class Mytest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
}
