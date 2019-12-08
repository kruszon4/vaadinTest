package com.test.vaadinTest;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    public MainView() {

        Display description = Display.builder()
                .addButton("Piotrek")
                .addButton("Czesiek")
                .addButton("Darek")
                .content("asf")
                .checkbox("test")
                .checkbox("test2")
                .build();


        description.getButtons().stream().forEach(e->add(e));
        description.getCheckboxes().stream().forEach(e->add(e));



        add(description);
        add(new Text("Welcome to MainView."));
    }

}