package common;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.InputStream;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeMethod
    public void start(){

        Properties prop = new Properties();
        InputStream inputFile = getClass().getClassLoader().getResourceAsStream("config.properties");

        try{
            prop.load(inputFile);
        }catch (Exception e){
            System.out.println("Erro ao carregar o config.properties" + e.getMessage());
        }

        Configuration.browser = prop.getProperty("browser");
        Configuration.baseUrl = prop.getProperty("url");
        Configuration.timeout = Long.parseLong(prop.getProperty("timeout"));

        open(Configuration.baseUrl);
    }
    @AfterMethod
    public void finish(){
        closeWindow();
    }
}
