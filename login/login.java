package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class login {
    public static void main(String[] args) {
        // Specify the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/ckt-pc32/Documents/chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to the login page
        driver.get("https://staging.theimagelab.co.uk/imagelab/users/login");

        // TC - 01:Perform login with empty username and password
        driver.findElement(By.xpath("//*[@id=\"user_username\"]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("");
        driver.findElement(By.id("login_users")).click();
        // Wait for 3 seconds (for demonstration purpose only)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Refresh the page
        driver.navigate().refresh();

        // TC - 02:Perform login with invalid username and empty password
        driver.findElement(By.xpath("//*[@id=\"user_username\"]")).sendKeys("Naveenuser");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("");
        driver.findElement(By.id("login_users")).click();
        // Wait for 3 seconds (for demonstration purpose only)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Refresh the page
        driver.navigate().refresh();

        // TC - 03:Perform login with invalid username and password
        driver.findElement(By.xpath("//*[@id=\"user_username\"]")).sendKeys("Naveenuser");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("1234567890");
        driver.findElement(By.id("login_users")).click();
        // Wait for 3 seconds (for demonstration purpose only)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Refresh the page
        driver.navigate().refresh();

        // TC - 04:Perform login with spaces in username and password
        driver.findElement(By.xpath("//*[@id=\"user_username\"]")).sendKeys("     ");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("     ");
        driver.findElement(By.id("login_users")).click();
        // Wait for 3 seconds (for demonstration purpose only)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Refresh the page
        driver.navigate().refresh();

        // TC - 05:Perform login with valid username and password
        driver.findElement(By.xpath("//*[@id=\"user_username\"]")).sendKeys("Pistanciouser");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("Pistancio@321");
        driver.findElement(By.id("login_users")).click();
        // Wait for 3 seconds (for demonstration purpose only)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Logout
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/a")).click();

        // Quit Browser
        driver.quit();
    }
}
