package org.vaadin.example.main.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class HomeView extends VerticalLayout {

    public HomeView() {
        add(new H1("Hello World!"));
        add(new Paragraph("This is the home view of the application."));
        add(new Button("Go to the playlists", e -> getUI().ifPresent(ui -> ui.navigate("playlist"))));
        add(new Button("Login", e -> getUI().ifPresent(ui -> ui.navigate("login"))));
    }
}
