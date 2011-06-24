/*
 * HomePage.java
 *
 * Created on June 19, 2011, 2:43 PM
 */

package com.myapp.wicket;           

import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends BasePage {

    public HomePage() {
        add(new Label("message", "Hello, World!"));
    }

}
