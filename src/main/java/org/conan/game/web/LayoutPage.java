package org.conan.game.web;

import org.apache.wicket.markup.html.basic.Label;
import org.conan.game.base.BasePage;

public abstract class LayoutPage extends BasePage{
    
    public LayoutPage(String title){
        add(new Label("layout.title", title));
    }

}
