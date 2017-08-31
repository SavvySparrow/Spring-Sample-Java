import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sahiljalan.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService service= appContext.getBean("customerService",CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());
	}
}
