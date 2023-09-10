package org.yahya;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        // Set up chrome driver
        ChromeDriver driver = new ChromeDriver();
        driver.get("www.google.com");

    }
}
