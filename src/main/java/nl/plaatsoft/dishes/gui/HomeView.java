package nl.plaatsoft.dishes.gui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.converter.StringToDateConverter;
import com.vaadin.flow.router.Route;

import nl.plaatsoft.dishes.dao.Person;

@Route("home")
public class HomeView extends VerticalLayout {

	private static final long serialVersionUID = 1L;
	
	private TemplateView templateView = new TemplateView();

	public HomeView() {
        add(templateView.banner());
        add(content());
        add(templateView.footer());
    }
    
    private VerticalLayout content() {
    
    	VerticalLayout layout = new VerticalLayout();
    	
    	List<Person> people = Arrays.asList(
    	        new Person("bplaat", 1, 10.5, new Date()),
    	        new Person("splaat", 2, 5.5, new Date()),
    	        new Person("lplaat", 3, 20.5, new Date()),
    	        new Person("jplaat", 5, 6.5, new Date()));

     	Grid<Person> grid = new Grid<>(Person.class);
    	grid.setColumns("name", "score", "money" ,"lastTime");
    	grid.setColumnReorderingAllowed(true);
    	grid.setHeightByRows(true);
    	grid.setItems(people);    	
    	grid.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS, GridVariant.LUMO_ROW_STRIPES);

    	layout.add(grid);
    	
    	return layout;    	
    }
    
    
}
