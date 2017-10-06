import com.perill.service.CustomerService;
import com.perill.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		//Instance of customer service
		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstName() + " " + service.findAll().get(0).getLastName());

	}

}
