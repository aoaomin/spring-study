import com.kuang.pojo.Cat;
import com.kuang.pojo.Dog;
import com.kuang.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) context.getBean("people");
        Dog dog = (Dog) context.getBean("dog");
        Cat cat = (Cat) context.getBean("cat");
        System.out.println(people.getName()+cat.getName()+dog.getName());
//        System.out.println(people.toString());
        people.getCat().shout();
        people.getDog().shout();
    }
}
