package org.vaadin.example.main.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.router.Route;

@Route("login")
public class LoginView extends AppLayout {

    public LoginView() {
        addToNavbar(new H1("Music Player"));
        addToNavbar(new Button("Go back to home", e -> getUI().ifPresent(ui -> ui.navigate(""))));
        LoginForm loginForm = new LoginForm();
        addToDrawer(loginForm);
    }
}



