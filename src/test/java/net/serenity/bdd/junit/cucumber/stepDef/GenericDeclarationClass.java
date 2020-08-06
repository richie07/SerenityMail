package net.serenity.bdd.junit.cucumber.stepDef;

import org.junit.rules.ErrorCollector;

import java.util.Properties;

public class GenericDeclarationClass {
    public static String configPath = System.getProperty("user.dir")+"\\config.properties";
    public final ErrorCollector collector = new ErrorCollector();
    public static Properties prop;
}
