package net.serenity.bdd.junit.cucumber.stepDef;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import net.serenitybdd.core.Serenity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GenericHookClass extends  GenericDeclarationClass{

    @Before
    public void beforeTest(Scenario scenario) throws IOException {

/*        for (String s:
             scenario.getSourceTagNames()) {
            System.out.println("Tags"+ s);
        }

        prop = new Properties();
        prop.load(new FileInputStream(configPath));

       // FirefoxProfile myprofile = new ProfilesIni().getProfile("selenium");
       // Serenity.useFirefoxProfile(myprofile);*/
    }

}
