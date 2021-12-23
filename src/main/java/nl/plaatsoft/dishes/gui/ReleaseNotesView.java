package nl.plaatsoft.dishes.gui;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.details.DetailsVariant;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("notes")
public class ReleaseNotesView extends VerticalLayout {

	private static final long serialVersionUID = 1L;
	
	private TemplateView templateView = new TemplateView();

	private Html v10 = new Html("<ul>" + 
			"<li>Rewrite in Vaadin</li>" +
			"<li>Create release note page</li>" +
			"</ul>");
		
	private Html v3 = new Html("<ul>" + 
			"<li>Added icon</li>" + 
			"<li>Added user management page (admin mode)</li>" + 
			"<li>Added transaction page</li>" + 
			"<li>Bugfix: lplaat and bplaat found a hack in to the system. This is now fixed!</li>"+
			"</ul>"); 

	private Html v2 = new Html("<ul>" + 
			"<li>Added email notification.</li>" + 
			"<li>Added release notes page.</li>" + 
			"<li>Added overview chart page.</li>" +
			"</ul>");

	private Html v1 = new Html("<ul>" + 
			"<li>Initial version</li>" +
			"</ul>");

	public ReleaseNotesView() {
        add(templateView.banner());
        add(content());
        add(templateView.footer());
    }
				
	private VerticalLayout content() {
		
		VerticalLayout layout = new VerticalLayout();
		
		Accordion accordion = new Accordion();
		accordion.setSizeFull();
       
		accordion.add("Version 1.0 (11-07-2020)", new Span(v10)).addThemeVariants(DetailsVariant.FILLED);
		accordion.add("Version 0.3 (31-10-2019)", new Span(v3)).addThemeVariants(DetailsVariant.FILLED);
		accordion.add("Version 0.2 (22-09-2019)", new Span(v2)).addThemeVariants(DetailsVariant.FILLED);
		accordion.add("Version 0.1 (20-09-2019)", new Span(v1)).addThemeVariants(DetailsVariant.FILLED);
		
		layout.add(accordion);
		
		return layout;
    }
}
