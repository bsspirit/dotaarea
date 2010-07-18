package org.conan.game.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * 
 * @author Conan Zhang <mailto:bsspirit@gmail.com>
 * 
 */
public class HomePage extends WebPage {

    public HomePage() {
        add(new Label("hello", "Hello World"));
    }

}
