package uploadimages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class upload {
    public static void main(String[] args) {
        // Specify the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/ckt-pc32/Documents/chromedriver-mac-x64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Navigate to the login page
        driver.get("https://staging.theimagelab.co.uk/imagelab/users/login");

        // TC - 01:Perform login with valid username and password
        driver.findElement(By.xpath("//*[@id=\"user_username\"]")).sendKeys("Pistanciouser");
        driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("Pistancio@321");
        driver.findElement(By.id("login_users")).click();
        // Wait for 3 seconds (for demonstration purpose only)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click on Upload Images
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/a")).click();
        // Upload images
        driver.findElement(By.xpath("/html/body/div[1]/form[2]/div[1]/div[1]/div/button")).click();
        // Locate the file upload input element (input[type='file'])
        WebElement fileUploadInput = driver.findElement(By.cssSelector("input[type='file']"));

        // Specify the file path of the image to upload
        String filePath = "/Users/ckt-pc32/Desktop/Sample Images/Normal Images/3.jpeg";

        // Create a File instance representing the image file
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            // Get the absolute path of the file
            String absolutePath = file.getAbsolutePath();

            // Use sendKeys to set the file path in the file upload input element
            fileUploadInput.sendKeys(absolutePath);

            // You may add additional logic here to handle the file upload process
            // For example, click a submit button after selecting the file

            // Example: Click a submit button after file upload
            WebElement uploadButton = driver.findElement(By.cssSelector("input[type='submit']"));
            uploadButton.click();

            // Simulate clicking a cancel button after the file is uploaded
            WebElement cancelButton = driver.findElement(By.cssSelector("button.cancel-button"));
            cancelButton.click();

            // Optional: Add a wait to ensure the file upload is completed
            // You can use WebDriverWait and ExpectedConditions to wait for a specific element
        } else {
            System.out.println("File not found at path: " + filePath);
        }
        // Wait for 3 seconds (for demonstration purpose only)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Select radio buttons 24 or 8 Hours
        driver.findElement(By.xpath("//*[@id=\"uploader_container\"]/div[8]/div[1]/label")).click();
    }
}