package reset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resetpassword {
    public static void main(String[] args) {
        // Specify the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/ckt-pc32/Documents/chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to the login page
        driver.get("https://staging.theimagelab.co.uk/imagelab/users/reset-password");

        // TC - 01:Perform forgot password with empty fields
        driver.findElement(By.xpath("/html/body/div[1]/form/input[1]")).sendKeys("");
        driver.findElement(By.xpath("/html/body/div[1]/form/input[2]")).click();
        // Wait for 3 seconds (for demonstration purpose only)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Refresh the page
        driver.navigate().refresh();

        // TC - 02:Perform forgot password with invalid email
        driver.findElement(By.xpath("/html/body/div[1]/form/input[1]")).sendKeys("naveen.coderkube@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/form/input[2]")).click();
        // Wait for 3 seconds (for demonstration purpose only)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Refresh the page
        driver.navigate().refresh();

        // TC - 03:Perform forgot password with spaces email field
        driver.findElement(By.xpath("/html/body/div[1]/form/input[1]")).sendKeys("     ");
        driver.findElement(By.xpath("/html/body/div[1]/form/input[2]")).click();
        // Wait for 3 seconds (for demonstration purpose only)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Refresh the page
        driver.navigate().refresh();

        // TC - 04:Perform forgot password with invalid email - invalid format
        driver.findElement(By.xpath("/html/body/div[1]/form/input[1]")).sendKeys("naveen.gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/form/input[2]")).click();
        // Wait for 3 seconds (for demonstration purpose only)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Refresh the page
        driver.navigate().refresh();

        // TC - 05:Perform forgot password with valid email address
        driver.findElement(By.xpath("/html/body/div[1]/form/input[1]")).sendKeys("pistanciozopado@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/form/input[2]")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Quit Browser
        driver.quit();
    }
}