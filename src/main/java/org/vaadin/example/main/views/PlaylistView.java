package org.vaadin.example.main.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("playlist")
public class PlaylistView extends VerticalLayout {

    public PlaylistView() {
        add(new H1("Playlist"));
        add(new Paragraph("This is the playlist view of the application."));
        add(new Button("Go back to home", e -> getUI().ifPresent(ui -> ui.navigate(""))));
    }
}
