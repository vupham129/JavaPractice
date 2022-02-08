package Practice29_02_05.browserTask;

public class DriverObjects {
    public static void main(String[] args) {

        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement("name");
        driver.findElements("id, name, linkText");
        driver.getTitle();
        driver.takeScreenShot();
        driver.executeScript("dafrwsrfwse");
        driver.close();
        driver.quit();

        System.out.println("-----------------------------");

        RemoteWebDriver driver1 = new FireFoxDriver();
        driver1.get("https://google.com");
        driver1.findElement("name");
        driver1.findElements("id, name, linkText");
        driver1.getTitle();
        driver1.takeScreenShot();
        driver1.executeScript("dafrwsrfwse");
        driver1.close();
        driver1.quit();

        System.out.println("-----------------------------");

        RemoteWebDriver driver2 = new EdgeDriver();
        driver2.get("https://google.com");
        driver2.findElement("name");
        driver2.findElements("id, name, linkText");
        driver2.getTitle();
        driver2.takeScreenShot();
        driver2.executeScript("dafrwsrfwse");
        driver2.close();
        driver2.quit();

        System.out.println("-----------------------------");

        RemoteWebDriver driver3 = new SafariDriver();
        driver3.get("https://google.com");
        driver3.findElement("name");
        driver3.findElements("id, name, linkText");
        driver3.getTitle();
        driver3.takeScreenShot();
        driver3.executeScript("dafrwsrfwse");
        driver3.close();
        driver3.quit();

        System.out.println("-----------------------------");

        RemoteWebDriver driver4 = new OperaDriver();
        driver4.get("https://google.com");
        driver4.findElement("name");
        driver4.findElements("id, name, linkText");
        driver4.getTitle();
        driver4.takeScreenShot();
        driver4.executeScript("dafrwsrfwse");
        driver4.close();
        driver4.quit();






    }
}
