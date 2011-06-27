/*
 * HomePage.java
 *
 * Created on June 19, 2011, 2:43 PM
 */
package com.myapp.wicket;

import java.util.Arrays;
import java.util.List;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;

public class HomePage extends WebPage {

    private static final String ZIPCODE = "ZIPCODE";
    private static final String PHONE = "PHONE";
    private static final List<String> TYPES = Arrays.asList(new String[]{ZIPCODE, PHONE});

    public HomePage(final PageParameters parameters) {
        add(new FeedbackPanel("feedback"));
        
        final DropDownChoice<String> type = new DropDownChoice<String>("type",
                new Model<String>(PHONE), TYPES);
        type.setRequired(true);

        final TextField<String> keywords = new TextField<String>("keywords",
                new Model<String>());

        Form< ? > form = new Form<Void>("form") {

            @Override
            protected void onSubmit() {
                info("Form successfully submitted");
            }
            
            protected void onValidate() {
                super.onValidate();
                
                if (hasError())
                    return;
                
            }
        };
        add(form);
        form.add(type);
        form.add(keywords);

    }
}
