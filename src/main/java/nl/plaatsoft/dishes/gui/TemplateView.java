package nl.plaatsoft.dishes.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class TemplateView {

	public VerticalLayout banner() {
		
		VerticalLayout layout = new VerticalLayout();
		
		layout.add( new H3("PlaatDishes v1.0.0"));
		layout.add(menuBar());
		
		return layout;		
	}
		
	private HorizontalLayout menuBar() {
    	
    	HorizontalLayout layout = new HorizontalLayout();
    	
    	Button home = new Button("Home");
    	home.addClickListener( e-> {
    		home.getUI().ifPresent(ui -> ui.navigate("home"));
		});
    	
    	Button transaction = new Button("Transaction");
    	transaction.addClickListener( e-> {
    		transaction.getUI().ifPresent(ui -> ui.navigate("dishes"));
		});
    	
    	Button marketPlace = new Button("Market Place");
    	
    	Button releaseNotes = new Button("Release Notes");
    	releaseNotes.addClickListener( e-> {
    		transaction.getUI().ifPresent(ui -> ui.navigate("notes"));
		});
    	    	
    	Button logout = new Button("Logout");
    	logout.addClickListener( e-> {
    		transaction.getUI().ifPresent(ui -> ui.navigate(""));
		});
    	
    	layout.add(home);
    	layout.add(transaction);
    	layout.add(marketPlace);
    	layout.add(releaseNotes);
    	layout.add(logout);
    	    
    	return layout; 
    }
    
	public VerticalLayout footer() {
    	
		VerticalLayout layout = new VerticalLayout();
		
    	Label label = new Label();
    	label.setText("Copyright (c) reserved 1996-2020 PlaatSoft");
    	
    	layout.add(label);
    	    	
    	return layout;
    }
}
