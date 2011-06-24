/*
 * Application.java
 *
 * Created on June 19, 2011, 2:43 PM
 */
 
package com.myapp.wicket;           

import org.apache.wicket.protocol.http.WebApplication;
/** 
 *
 * @author hollgam
 * @version 
 */

public class Application extends WebApplication {

    public Application() {
    }

    public Class getHomePage() {
        return HomePage.class;
    }

}
