package com.example.socialcoding;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.security.core.context.SecurityContextHolder;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        Button logoutButton = new Button("Logout", event -> {
            SecurityContextHolder.clearContext();
            getUI().ifPresent(ui -> ui.getPage().setLocation("/login"));
        });

        add(logoutButton);
    }
}
