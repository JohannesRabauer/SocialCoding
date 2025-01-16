package de.johannes_rabauer.copilot_test;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("login")
public class LoginView extends VerticalLayout {

    public LoginView() {
        LoginForm loginForm = new LoginForm();
        loginForm.setAction("login");

        Button loginButton = new Button("Login", event -> loginForm.submit());

        add(loginForm, loginButton);
    }
}
