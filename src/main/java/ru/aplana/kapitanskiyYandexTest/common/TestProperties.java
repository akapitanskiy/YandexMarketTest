package ru.aplana.kapitanskiyYandexTest.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by AKapitanskiy on 20.10.2016 16:19.
 */

public class TestProperties {
    private final Properties properties = new Properties();

    private static TestProperties INSTANCE = null;

    private TestProperties() {
        try {
            FileInputStream in = null;
            InputStreamReader inR = null;

            String fName = (System.getProperty("dbConnection")==null)?"dbConnection":System.getProperty("dbConnection");

            in = new FileInputStream(new File("./" +fName + ".properties"));
            inR = new InputStreamReader(in, "windows-1251");
            properties.load(inR);
            System.err.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TestProperties getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TestProperties();
        }
        return INSTANCE;
    }

    public Properties getProperties() {
        return properties;
    }
}
