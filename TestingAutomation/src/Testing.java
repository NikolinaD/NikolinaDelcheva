import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Testing {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\nikol\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        WebElement field = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[1]/td/input"));
        field.clear();
        field.sendKeys("Nikolina Delcheva");

        field = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[2]/td/input"));
        field.clear();
        field.sendKeys("ObichamKotki");

        field = driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[3]/td/textarea"));
        field.clear();
        field.sendKeys("I believe in world peace.");

        Select select= new Select(driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[8]/td/select")));
        select.selectByVisibleText("Drop Down Item 4");

        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[3]")).click();
        // I used the same piece of code for unchecking the third checkbox.Since it was already checked the same command will uncheck it.

        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[6]/td/input[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option[1]"));



    }
}
