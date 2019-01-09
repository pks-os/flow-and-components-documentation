package com.vaadin.flow.tutorial.advanced;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.tutorial.annotations.CodeFor;

@CodeFor("advanced/tutorial-dynamic-content.asciidoc")
public class MainDynamicContentServlet extends VerticalLayout {

    Person person = new Person();

    public MainDynamicContentServlet() {
        Image image = new Image();
        image.setSrc("person-photo?id=" + person.getId());
        add(image);
    }
}
