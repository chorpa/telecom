package telecom;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkk.domain.User;

public class SpringTest {
	@Test
	public void test(){
		String cfg = "applicationContext.xml";
        ApplicationContext ctx = 
            new ClassPathXmlApplicationContext(cfg);
        System.out.println(ctx);
        User user = new User();
        user.setUserName("还计较这什么");
        System.out.println(user.getUserName());
	}
}
