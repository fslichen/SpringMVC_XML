package architect.autowired;

import org.springframework.stereotype.Service;

@Service
public class AutowiredService {
	public void anyMethod() {
		System.out.println("Hello World");
	}
}
