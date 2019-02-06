package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;

public class Utils {

    public static void aguardarElemento(final WebElement element, WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver, 600);

        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                String value = element.getText();

                if(!value.equals("")) {
                    return true;
                }
                return false;
            }
        });
    }

    public static Boolean verificaHashmapInconsistencia (HashMap<String, Boolean> hmap, String itemSobreposicao){

        for (HashMap.Entry<String, Boolean> teste : hmap.entrySet()) {
            String key = teste.getKey ();
            Boolean value = teste.getValue ();

            if (key.equals (itemSobreposicao)){
                return value;
            }
        }
        return false;
    }
}
