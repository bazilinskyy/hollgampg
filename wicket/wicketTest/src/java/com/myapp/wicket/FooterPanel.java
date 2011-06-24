/*
 * FooterPanel.java
 *
 * Created on June 19, 2011, 2:43 PM
 */
 
package com.myapp.wicket;           

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

/** 
 *
 * @author hollgam
 * @version 
 */

public final class FooterPanel extends Panel {

    public FooterPanel(String id, String text) {
        super(id);
        add(new Label("footerpanel_text", text));
    }

}
