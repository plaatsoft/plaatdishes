package nl.plaatsoft.dishes.gui;

import java.time.LocalDate;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("dishes")
public class DishesView extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	private TemplateView templateView = new TemplateView();
	
	public DishesView() {
		 add(templateView.banner());
	     add(content());
	     add(templateView.footer());		
	}
	
	private VerticalLayout content() {
		
		VerticalLayout layout = new VerticalLayout();
		
		DatePicker date = new DatePicker();
		LocalDate now = LocalDate.now();
		date.setLabel("Datum");
		date.setValue(now);
				
		ComboBox<String> gebruiker = new ComboBox<>();
		gebruiker.setItems("lplaat", "splaat", "jplaat", "bplaat");
		gebruiker.setLabel("Gebruiker");
		gebruiker.setValue("lplaat");
		
		ComboBox<String> afruimen = new ComboBox<>();
		afruimen.setItems("0", "1", "2", "3");
		afruimen.setLabel("Afruimen");
		afruimen.setValue("0");
		
		ComboBox<String> afdrogen = new ComboBox<>();
		afdrogen.setItems("0", "1", "2", "3");
		afdrogen.setLabel("Afdrogen");
		afdrogen.setValue("0");
		
		ComboBox<String> opruimen = new ComboBox<>();
		opruimen.setItems("0", "1", "2", "3");
		opruimen.setLabel("Opruimen");
		opruimen.setValue("0");
		
		ComboBox<String> sfeer = new ComboBox<>();
		sfeer.setItems("0", "1", "2", "3");
		sfeer.setLabel("Sfeer");
		sfeer.setValue("0");
			
		Button save = new Button("Save", new Icon(VaadinIcon.SAFE));		
		save.addClickListener( e-> {
			 new Notification( "Information is saved", 3000);
		     save.getUI().ifPresent(ui -> ui.navigate("home"));
		});
		
		Button cancel = new Button("Cancel", new Icon(VaadinIcon.BACKSPACE));			
		cancel.addClickListener( e-> {
		     cancel.getUI().ifPresent(ui -> ui.navigate("home"));
		});
						    
		HorizontalLayout layout1 = new HorizontalLayout();
		layout1.add(date);
		layout1.add(gebruiker);
		
		HorizontalLayout layout2 = new HorizontalLayout();		
		layout2.add(afruimen);
		layout2.add(afdrogen);
		layout2.add(opruimen);
		layout2.add(sfeer);
		
		HorizontalLayout layout3 = new HorizontalLayout();
		layout3.add(save);
		layout3.add(cancel);
		
		layout.add(layout1);
		layout.add(layout2);
		layout.add(layout3);
		
		return layout;		
	}

}
