package architect.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutowiredController {
	@Autowired// You don't need spring dependencies when using @Autowired because spring MVC already includes that.
	AutowiredService autowiredService;
	
	@RequestMapping(value = "/autowired", method = RequestMethod.GET)
	public void anyMethod() {
		autowiredService.anyMethod();
	}
}
