/*
 * HomePage.java
 *
 * Created on June 19, 2011, 2:43 PM
 */
package com.myapp.wicket;

import formCountryCity.City;
import formCountryCity.Country;
import formCountryCity.Database;
import java.util.List;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.model.PropertyModel;

/* Basic form example
 */
//public class HomePage extends WebPage {
//
//    
//    private static final String ZIPCODE = "ZIPCODE";
//    private static final String PHONE = "PHONE";
//    private static final List<String> TYPES = Arrays.asList(new String[]{ZIPCODE, PHONE});
//
//    public HomePage(final PageParameters parameters) {
//        add(new FeedbackPanel("feedback"));
//        
//        final DropDownChoice<String> type = new DropDownChoice<String>("type",
//                new Model<String>(PHONE), TYPES);
//        type.setRequired(true);
//
//        final TextField<String> keywords = new TextField<String>("keywords",
//                new Model<String>());
//
//        Form< ? > form = new Form<Void>("form") {
//
//            @Override
//            protected void onSubmit() {
//                info("Form successfully submitted");
//            }
//            
//            protected void onValidate() {
//                super.onValidate();
//                
//                if (hasError())
//                    return;
//                
//            }
//        };
//        add(form);
//        form.add(type);
//        form.add(keywords); 
//    }
//}

/* Form example 1
 */
// refer to the code bundle for markup
//public class HomePage extends WebPage {
//
//    private static Country country;
//    private static City city;
//
//    private static class CountriesModel extends LoadableDetachableModel<List<? extends Country>> {
//
//        @Override
//        protected List<? extends Country> load() {
//            return Database.getCountries();
//        }
//    }
//
//    private static class CitiesModel extends LoadableDetachableModel<List<? extends City>> {
//
//        @Override
//        protected List<? extends City> load() {
//            return Database.getCities(country.getCountryCode());
//        }
//    }
//
//    public HomePage(final PageParameters parameters) {
//        country = Database.getCountries().get(0);
//
//        //Adding components
//        add(new FeedbackPanel("feedback"));
//
//        Form< ?> form = new Form<Void>("form") {
//
//            @Override
//            protected void onSubmit() {
//                info("Form successfully submitted");
//            }
//        };
//        add(form);
//
//
//        DropDownChoice<Country> countries =
//                new DropDownChoice<Country>("countries",
//                new PropertyModel<Country>(this, "country"),
//                new CountriesModel(),
//                new ChoiceRenderer<Country>("name", "code")) {
//
//                    @Override
//                    protected boolean wantOnSelectionChangedNotifications() {
//                        return true;
//                    }
//
//                    @Override
//                    protected void onSelectionChanged(Country newSelection) {
//                        city = null;
//                    }
//                };
//        countries.setRequired(true);
//        form.add(countries);
//
//        DropDownChoice<City> cities =
//                new DropDownChoice<City>("cities",
//                new PropertyModel<City>(this, "city"),
//                new CitiesModel(),
//                new ChoiceRenderer<City>("name", "code"));
//        cities.setRequired(true);
//        form.add(cities);
//
//    }
//}
public class HomePage extends WebPage {

    private Country country;
    private City city;

    public HomePage(final PageParameters parameters) {
        country = Database.getCountries().get(0);

        add(new FeedbackPanel("feedback"));

        Form<?> form = new Form<Void>("form") {

            @Override
            protected void onSubmit() {
                info("Your favorite city is: " + city.getCityName() + " in " + country.getCountryName());
            }
        };
        add(form);

        DropDownChoice<Country> countries = new DropDownChoice<Country>("countries",
                new PropertyModel<Country>(this, "country"), new CountriesModel(),
                new ChoiceRenderer<Country>("name", "code")) {

            @Override
            protected boolean wantOnSelectionChangedNotifications() {
                return true;
            }

            @Override
            protected void onSelectionChanged(Country newSelection) {
                city = null;
            }
        };
        countries.setRequired(true);
        form.add(countries);

        DropDownChoice<City> cities = new DropDownChoice<City>("cities", new PropertyModel<City>(
                this, "city"), new CitiesModel(), new ChoiceRenderer<City>("name", "code"));
        cities.setRequired(true);
        form.add(cities);
    }

    private static class CountriesModel extends LoadableDetachableModel<List<? extends Country>> {

        @Override
        protected List<? extends Country> load() {
            return Database.getCountries();
        }
    }

    private class CitiesModel extends LoadableDetachableModel<List<? extends City>> {

        @Override
        protected List<? extends City> load() {
            return Database.getCities(country.getCountryCode());
        }
    }
}
