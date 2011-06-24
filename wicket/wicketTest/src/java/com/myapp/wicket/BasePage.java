/*
 * WicketExamplePage.java
 *
 * Created on June 19, 2011, 2:43 PM
 */
 
package com.myapp.wicket;           

import org.apache.wicket.markup.html.WebPage;

/** 
 *
 * @author hollgam
 * @version 
 */

public abstract class BasePage extends WebPage {

    public BasePage() { 
        super(); 
        add(new HeaderPanel("headerpanel", "Welcome To Wicket")); 
        add(new FooterPanel("footerpanel", "Powered by Wicket and the NetBeans Wicket Plugin"));
    } 

}
