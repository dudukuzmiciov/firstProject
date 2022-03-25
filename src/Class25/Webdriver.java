package Class25;

public class Webdriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes
    that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */

}
interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Maximizing chrome brousser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Close chrome browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Chrome browser");
    }
    @Override
    public void findElement() {
        System.out.println("Find elements in Chrome browser");
    }

}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Opening Firefox browser");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Maximizing Firefox browser");
    }
    @Override
    public void findElement(){
        System.out.println("Finding Firefox browser elements");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing Firefox browser elements");
    }
}




