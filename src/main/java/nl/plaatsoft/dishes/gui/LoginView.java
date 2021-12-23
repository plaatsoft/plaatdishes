package nl.plaatsoft.dishes.gui;

import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

@Route("")
@PWA(name = "PlaatDishes", shortName = "PlaatDishes")
public class LoginView extends LoginForm {
	
	private static final long serialVersionUID = 1L;

	LoginView() {
		
		addLoginListener(e -> {
			
			if (e.getUsername().contentEquals("admin") && e.getPassword().contentEquals("admin")) {
				getUI().ifPresent(ui -> ui.navigate("home"));
			} else {
		        setError(true);
			}
		});		
	}	

	
}
