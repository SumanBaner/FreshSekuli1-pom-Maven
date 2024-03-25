import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


    import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


    public class MethodRepository {
        private WebDriver driver;
////First chng

        public void browserApplicationLaunch(String browserName, String url) throws InterruptedException {

            try {
                if (browserName.equals("chrome")) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                }

                if (browserName.equals("firefox")) {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                }
                if (browserName.equals("edge")) {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    driver.manage().window().maximize();
                }

                driver.get(url);
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        //sauce Demo
        //public void loginInApplication() throws InterruptedException {

        // BY id Identifier---Sauce Demo
       /* WebElement txtUsername = driver.findElement(By.id("user-name"));
        txtUsername.sendKeys("standard_user");

        WebElement txtPassword = driver.findElement(By.id("password"));
        txtPassword.sendKeys("secret_sauce");

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        btnLogin.click();*/

        //by absolute path-Sauce demo
        //WebElement txtUsername = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div/input"));
        //txtUsername.sendKeys("standard_user");
        //Thread.sleep(3000);

        //WebElement txtPassword = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[2]/input"));
        // txtPassword.sendKeys("secret_sauce");
        //Thread.sleep(3000);
        //WebElement btnLogin = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/input"));
        //btnLogin.click();

        /*by relative path-In Sauce demo*/
        // WebElement txtEmailAddress = driver.findElement(By.xpath("//input[@id='user-name']"));
        // txtEmailAddress.sendKeys("standard_user");
        // Thread.sleep(3000);
        // WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
        // txtPassword.sendKeys("secret_sauce");
        // Thread.sleep(3000);

        //WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login-button']"));
        // btnLogin.click();
        //WebElement btnLogout = driver.findElement(By.id("logout_sidebar_link"));
        //btnLogout.click();

//Verification with Page Title

        // String expPageTitle = "Swag Labs";

        //System.out.println(expPageTitle);
        // String actPageTitle = driver.getTitle();
        //System.out.println(actPageTitle);
        //  if (expPageTitle.equals(actPageTitle)) {
        //  System.out.println("Login is successful with valid credentials");
        //} else {
        //   System.out.println("Login is unsuccessful with valid credentials");
        //}
//Verification with CurrentURL

       /* String expCurrentURL ="https://www.saucedemo.com/inventory.html";
        String actCurrentURL = driver.getCurrentUrl();

        if(expCurrentURL.equals(actCurrentURL)){
            System.out.println("Login is successful with valid credentials");
        }else {
            System.out.println("Login is unsuccessful with valid credentials");
        }/*

}

        */

        //Skysite company application---By ID


        public void loginInApplication() throws InterruptedException {

            //WebElement txtUsername = driver.findElement(By.id("UserID"));
            //txtUsername.sendKeys("louissuman16@gmail.com");

            // WebElement txtPassword = driver.findElement(By.id("Password"));
            // txtPassword.sendKeys("123456");

            // WebElement btnLogin = driver.findElement(By.id("btnLogin"));
            // btnLogin.click();
            // Relative path-Skysite website---Relative path
            // WebElement txtUserName = driver.findElement(By.xpath("//input[@id='UserID']"));
            // txtUserName.sendKeys("louissuman16@gmail.com");
            //Thread.sleep(3000);
            //WebElement txtPassword = driver.findElement(By.xpath("//input[@id='Password']"));
            // txtPassword.sendKeys("123456");
            // Thread.sleep(3000);
            // WebElement btnLogin = driver.findElement(By.xpath("//button[@id='btnLogin']"));
            // btnLogin.click();
            //Verification with Page Title
            //String expPageTitle = "Project list - SKYSITE Projects";
            //System.out.println(expPageTitle);
            //String actPageTitle = driver.getTitle();
            //System.out.println(actPageTitle);
            //if(expPageTitle.equals(actPageTitle)){
            //System.out.println("Login is successful with valid credentials");
            //}else {
            //System.out.println("Login is unsuccessful with valid credentials");
            //Verification with CurrentURL


            // String expCurrentURL ="https://app.skysite.com/Project/ProjectList?x=0&isFromLogin=True&isFromSharedProject=False";
            // String actCurrentURL = driver.getCurrentUrl();

            //if (expCurrentURL.equals(actCurrentURL)) {
            //   System.out.println("Login is successful with valid credentials");
            //} else {
            // System.out.println("Login is unsuccessful with valid credentials");
            // }
            // }
            //Absolute path -Skysite website---absolute path
            //WebElement txtUserName = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div/input"));
            // txtUserName.sendKeys("louissuman16@gmail.com");
            //Thread.sleep(3000);
            //WebElement txtPassword = driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div/div[2]/input"));
            // txtPassword.sendKeys("123456");
            //Thread.sleep(3000);
            //WebElement btnLogin = driver.findElement(By.xpath("/html/body/form/div[1]/div/div/div[3]/div/div[1]/div[4]/button"));
            //btnLogin.click();
    /*public void loginInApplication() {
// Arc company-Ishipdocs---By Id-------
        WebElement txtUserName = driver.findElement(By.id("txtUserId"));
        txtUserName.sendKeys("louissuman16@gmail.com");

        WebElement txtPassword = driver.findElement(By.id("txtPassword"));
        txtPassword.sendKeys("123456");

        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        btnLogin.click();}}*/
//Arc company-Ishipdocs---By Relative path-------
            // WebElement txtUserName=driver.findElement(By.xpath("//input[@id='txtUserId']"));
            //txtUserName.sendKeys("louissuman16@gmail.com");
            //Thread.sleep(3000);
            //WebElement txtPassword=driver.findElement(By.xpath("//input[@id='txtPassword']"));
            //txtPassword.sendKeys("123456");
            //Thread.sleep(3000);
            //WebElement btnLogin= driver.findElement(By.xpath("//input[@id='btnLogin']"));
            // btnLogin.click();
            // Arc company-Ishipdocs---By Absolute path-------
            //WebElement txtUserName=driver.findElement(By.xpath("/html/body/form/div[7]/div/div/div[2]/div[1]/div/div/div[1]/div/input"));
            //txtUserName.sendKeys("louissuman16@gmail.com");
            // Thread.sleep(3000);
            // WebElement txtPassword=driver.findElement(By.xpath("/html/body/form/div[7]/div/div/div[2]/div[1]/div/div/div[2]/div/input"));
            // txtPassword.sendKeys("123456");
            // Thread.sleep(3000);
            // WebElement btnLogin=driver.findElement(By.xpath("/html/body/form/div[7]/div/div/div[2]/div[1]/div/div/div[4]/input"));
            // btnLogin.click();

            //Verification with CurrentURL
            // String expCurrentURL = "https://www.ishipdocs.com/ishipdocscustomer/Documents/Default.aspx?Key=U2muC1rkq046Jbv6BxPVc1mZUDRcIuTa/oqZ/kN5ulkXSVWLeCGy3MCetclvuCpu";
            // String actCurrentURL = driver.getCurrentUrl();

            // if(expCurrentURL.equals(actCurrentURL)){
            //System.out.println("Login is successful with valid credentials");
            // }else {
            //  System.out.println("Login is unsuccessful with valid credentials");
            // }
//Relative path Arc Facilities

//WebElement txtUserName=driver.findElement(By.xpath("//input=[@id='UserID']"));
            // txtUserName.sendKeys("louissuman16@gmail.com");
            // Thread.sleep(3000);
            //WebElement txtPassword=driver.findElement(By.xpath("//input=[@id='Password']"));
            //txtPassword.sendKeys("123456");
            //Thread.sleep(3000);
            // WebElement btnSignin=driver.findElement(By.xpath("//button=[@id='btnLogin']"));
            //btnSignin.click();

        }

        public void loginWithRobotClass() {
            try {
                WebElement txtEmailAddress = driver.findElement(By.id("email"));
                txtEmailAddress.sendKeys("louissuman16@gmail.com");
                WebElement txtPassword = driver.findElement(By.id("passwd"));
                txtPassword.sendKeys("123456");

                Robot robot = new Robot();
                Thread.sleep(4000);
                /* Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false); */
                robot.keyPress(KeyEvent.VK_TAB);
                Thread.sleep(4000);
                robot.keyPress(KeyEvent.VK_TAB);
                Thread.sleep(4000);
                robot.keyPress(KeyEvent.VK_ENTER);
                Thread.sleep(5000);

                String expPageTitle = "Default";
                String actPageTitle = driver.getTitle();

                if (expPageTitle.equals(actPageTitle)) {
                    System.out.println("Login is successful with valid credentials");
                } else {
                    System.out.println("Login is unsuccessful with valid credentials");
                }
            } catch (AWTException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (UnsupportedOperationException e) {
                throw new RuntimeException(e);
            }
        }

        public void iframeHandling() {
            try {
                // WebDriverManager.chromedriver().setup();
                //driver = new ChromeDriver();
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.javatpoint.com/");
                Thread.sleep(25000);
                driver.switchTo().frame("google_ads_iframe_/103512698,22511567001/22750333633_0");
                WebElement imageInIframe = driver.findElement(By.xpath("//img[@class='i-amphtml-fill-content i-amphtml-replaced-content']"));
                //JavascriptExecutor js = (JavascriptExecutor) driver;
                //js.executeScript("arguments[0].scrollIntoView();", imageInIframe);
                Thread.sleep(4000);
                imageInIframe.click();

                /* driver.switchTo().parentFrame(); */
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void ScrollDown() {
            try {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.javatpoint.com/");
                Thread.sleep(5000);
                WebElement element = driver.findElement(By.linkText("Keras"));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
                //js.executeScript("window.scrollBy(0,500)");
                js.executeScript("arguments[0].scrollIntoView();", element);
                Thread.sleep(5000);
                // js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public void scrollUp() {
            try {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://www.javatpoint.com/");
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
                Thread.sleep(5000);
                //js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
                js.executeScript("window.scrollTo(0,0)");
                js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void multipleWindowHandling() {
            try {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://demoqa.com/browser-windows");
                driver.manage().window().maximize();
                Thread.sleep(5000);
                driver.findElement(By.id("messageWindowButton")).click();
                //driver.findElement(By.id("windowButton")).click();
                Thread.sleep(5000);
                String mainWindowHandle = driver.getWindowHandle();
                System.out.println("This is main window information: " + mainWindowHandle);
                Set<String> allWindowHandles = driver.getWindowHandles();
                System.out.println("This is all window information: " + allWindowHandles);
                Iterator<String> iterator = allWindowHandles.iterator();

                // Here we will check if child window has other child windows and will fetch the heading of the child window
                while (iterator.hasNext()) {
                    String childWindow = iterator.next();
                    if (!mainWindowHandle.equalsIgnoreCase(childWindow)) {
                        driver.switchTo().window(childWindow);
                        // WebElement text = driver.findElement(By.id("sampleHeading"));
                        // System.out.println("Heading of child window is: " + text.getText());
                        driver.close();
                        System.out.println("Closing");
                    }
                }

                // Switching to Parent window that is Main Window.
                driver.switchTo().window(mainWindowHandle);
                //driver.switchTo().defaultContent();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void Multab() {
            try {
                Thread.sleep(5000);
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://demo.guru99.com/popup.php");
                driver.manage().window().maximize();
                Thread.sleep(5000);
                driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
                String MainWindow = driver.getWindowHandle();
                Set<String> s1 = driver.getWindowHandles();
                Iterator<String> i1 = s1.iterator();
                while (i1.hasNext()) {
                    String ChildWindow = i1.next();

                    if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                        driver.switchTo().window(ChildWindow);
                        Thread.sleep(5000);
                        driver.findElement(By.name("emailid"))
                                .sendKeys("Suman.striver@gmail.com");
                        Thread.sleep(5000);
                        driver.findElement(By.name("btnLogin")).click();
                        driver.close();
                    }
                }

                driver.switchTo().window(MainWindow);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void loginWithSikuli() throws InterruptedException, FindFailed {
            Thread.sleep(3000);
            WebElement username = driver.findElement(By.id("user-name"));
            username.sendKeys("standard_user");
            String filePath1 = "E:\\TestAutomation\\SeleniumTest\\Projects\\FreshSekuli\\src\\test\\sikulefiles\\";
            Screen sc1 = new Screen();
            Pattern password = new Pattern(filePath1 + "password.PNG");
            Thread.sleep(6000);
            sc1.click(password);
            //WebElement password1= driver.findElement(By.id("password"));
            //password1.sendKeys("secret_sauce");
            sc1.type("secret_sauce");
            Thread.sleep(6000);
            String filePath = "E:\\TestAutomation\\SeleniumTest\\Projects\\FreshSekuli\\src\\test\\sikulefiles\\";
            //String filePath = "./sikulefiles";
            Screen sc = new Screen();
            Pattern loginButtonSnap = new Pattern(filePath + "loginButtonSnap.PNG");
            Thread.sleep(6000);
            sc.click(loginButtonSnap);
            Thread.sleep(6000);
        }

        public void fileUploadWithAutoIt() throws InterruptedException, IOException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://imgbb.com/");
            Thread.sleep(7000);
            WebElement btnUpload = driver.findElement(By.xpath("//a[contains(text(),'Start uploading')]"));
            btnUpload.click();
            Thread.sleep(3000);
            //Runtime.getRuntime().exec("C:\\Files\\FileUpload.exe");
            Runtime.getRuntime().exec("./Autoit/FileUpload.exe");
            Thread.sleep(7000);
        }

        public void popups() throws InterruptedException, AWTException {
            Thread.sleep(5000);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.ishipdocs.com/ishipdocs/Secure/Login.aspx");
            driver.manage().window().maximize();
            Thread.sleep(5000);
            WebElement pp = driver.findElement(By.xpath("//div[@id='securityUpdateMessage']/div[1]/button"));
            Thread.sleep(5000);
            pp.click();
            WebElement username = driver.findElement(By.xpath("//input[@id='txtUserId']"));
            username.sendKeys("louissuman16@gmail.com");
            Thread.sleep(3000);
            WebElement txtpassword = driver.findElement(By.xpath("//input[@id='txtPassword']"));
            txtpassword.sendKeys("123456");
            Thread.sleep(3000);
            WebElement Signin = driver.findElement(By.xpath("//input[@id='btnLogin']"));
            Signin.click();
        }

        public void fileUploadWithdemoAutoIt() throws InterruptedException, IOException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/upload-download");
            Thread.sleep(7000);
            //WebElement btnUpload = driver.findElement(By.xpath("//a[contains(text(),'Start uploading')]"));
            //btnUpload.click();
            //WebElement ChooseFile=driver.findElement(By.xpath("//input[@id='uploadFile']"));
            //WebElement ChooseFile=driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/form/div/label"));
            //ChooseFile.click();
            WebElement sel = driver.findElement(By.xpath("//label[@class='form-file-label']"));
            sel.click();
            Thread.sleep(7000);
            //Runtime.getRuntime().exec("C:\\Files\\FileUpload.exe");
            Runtime.getRuntime().exec("./Autoit/FileUpload.exe");
            Thread.sleep(7000);
        }

        public void skyfileUploadWithAutoIt() throws InterruptedException, IOException, AWTException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.skysite.com/?FirstTimeLogin=no");
            WebElement txtUsername = driver.findElement(By.id("UserID"));
            txtUsername.sendKeys("louissuman16@gmail.com");
            WebElement txtPassword = driver.findElement(By.id("Password"));
            txtPassword.sendKeys("123456");
            WebElement btnLogin = driver.findElement(By.id("btnLogin"));
            btnLogin.click();
            Thread.sleep(10000);
            WebElement SendFiles = driver.findElement(By.xpath("//*[@id='mainPageHeader']/nav/div[2]/ul/li[2]/div/a[2]/i"));
            SendFiles.click();
            Thread.sleep(15000);
            WebElement ChooseFiles = driver.findElement(By.xpath("//button[@class='btn qq-upload-button btn-primary']"));
            Actions action = new Actions(driver);
            action.moveToElement(ChooseFiles);
            action.click().build().perform();
            Thread.sleep(7000);
            Runtime.getRuntime().exec("./Autoit/FileUpload.exe");
            Thread.sleep(7000);
            Robot robot = new Robot();
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(2000);
            WebElement Typeemailhere = driver.findElement(By.xpath("//textarea[@class='emailinputdiv']"));
            //Actions action1=new Actions(driver);
            //action1.moveToElement(Typeemailhere);
            //action1.click();
            // .sendKeys("abc@gmail.com").build().perform();
            Typeemailhere.sendKeys("abc@gmail.com");
            Thread.sleep(7000);
            WebElement Sub = driver.findElement(By.xpath("//input[@id='txtSubject']"));
            Sub.sendKeys("Test");
            Thread.sleep(5000);
            WebElement Msg = driver.findElement(By.xpath("//*[@id='txtMessage']"));
            Msg.sendKeys("Good Application");
            Thread.sleep(5000);
            WebElement Sendbut = driver.findElement(By.xpath("//button[@id='send-file']"));
            Sendbut.click();


        }

        public void skyfileMulUploadWithAutoIt() throws InterruptedException, IOException, AWTException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.skysite.com/?FirstTimeLogin=no");
            WebElement txtUsername = driver.findElement(By.id("UserID"));
            txtUsername.sendKeys("louissuman16@gmail.com");
            WebElement txtPassword = driver.findElement(By.id("Password"));
            txtPassword.sendKeys("123456");
            WebElement btnLogin = driver.findElement(By.id("btnLogin"));
            btnLogin.click();
            Thread.sleep(10000);
            WebElement SendFiles = driver.findElement(By.xpath("//*[@id='mainPageHeader']/nav/div[2]/ul/li[2]/div/a[2]/i"));
            SendFiles.click();
            Thread.sleep(15000);
            WebElement ChooseFiles = driver.findElement(By.xpath("//button[@class='btn qq-upload-button btn-primary']"));
            Actions action = new Actions(driver);
            action.moveToElement(ChooseFiles);
            action.click().build().perform();
            Thread.sleep(7000);
            Runtime.getRuntime().exec("./Autoit/FileUpload.exe");
            //Runtime.getRuntime().exec("C:\\Files\\FileUpload.exe");
            Thread.sleep(10000);
            WebElement ChooseFiles1 = driver.findElement(By.xpath("//button[@class='btn qq-upload-button btn-primary']"));
            Actions action1 = new Actions(driver);
            action1.moveToElement(ChooseFiles1);
            action1.click().build().perform();
            Thread.sleep(7000);
            Runtime.getRuntime().exec("./Autoit/FileUpload1.exe");
            //Runtime.getRuntime().exec("C:\\Files\\FileUpload1.exe");
            Thread.sleep(7000);
            Robot robot = new Robot();
            Thread.sleep(3000);
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_TAB);
            Thread.sleep(2000);
            WebElement Typeemailhere = driver.findElement(By.xpath("//textarea[@class='emailinputdiv']"));
            Typeemailhere.sendKeys("abc@gmail.com");
            Thread.sleep(7000);
            WebElement Sub = driver.findElement(By.xpath("//input[@id='txtSubject']"));
            Sub.sendKeys("Test");
            Thread.sleep(5000);
            WebElement Msg = driver.findElement(By.xpath("//*[@id='txtMessage']"));
            Msg.sendKeys("Good Application");
            Thread.sleep(5000);
            WebElement Sendbut = driver.findElement(By.xpath("//button[@id='send-file']"));
            Sendbut.click();


        }

        public void dragdrop() throws InterruptedException, FindFailed {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.skysite.com/?FirstTimeLogin=no");
            WebElement txtUsername = driver.findElement(By.id("UserID"));
            txtUsername.sendKeys("louissuman16@gmail.com");
            WebElement txtPassword = driver.findElement(By.id("Password"));
            txtPassword.sendKeys("123456");
            WebElement btnLogin = driver.findElement(By.id("btnLogin"));
            btnLogin.click();
            Thread.sleep(10000);
            WebElement SendFiles = driver.findElement(By.xpath("//*[@id='mainPageHeader']/nav/div[2]/ul/li[2]/div/a[2]/i"));
            SendFiles.click();
            Thread.sleep(6000);
            WebElement Dragarea = driver.findElement(By.id("//*[@class='col-md-12 pw-drag-drop']"));
            //username.sendKeys("standard_user");
            String filePath1 = "E:\\TestAutomation\\SeleniumTest\\Projects\\FreshSekuli\\src\\test\\sikulefiles\\";
            Screen sc1 = new Screen();
            Pattern Dragdrop = new Pattern(filePath1 + "Fileup.PNG");
            sc1.click(Dragdrop);
            Thread.sleep(6000);
            //WebElement password1= driver.findElement(By.id("password"));
            //password1.sendKeys("secret_sauce");
            //sc1.type("secret_sauce");
            Thread.sleep(6000);
            //String filePath = "E:\\TestAutomation\\SeleniumTest\\Projects\\FreshSekuli\\src\\test\\sikulefiles\\";
            //String filePath = "./sikulefiles";
            //Screen sc = new Screen();
            // Pattern loginButtonSnap = new Pattern(filePath + "loginButtonSnap.PNG");
            //Thread.sleep(6000);
            //sc.click(loginButtonSnap);
            //Thread.sleep(6000);
        }

        public void CreateProj() throws InterruptedException, FindFailed {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://app.skysite.com/?FirstTimeLogin=no");
            WebElement txtUsername = driver.findElement(By.id("UserID"));
            txtUsername.sendKeys("louissuman16@gmail.com");
            WebElement txtPassword = driver.findElement(By.id("Password"));
            txtPassword.sendKeys("123456");
            WebElement btnLogin = driver.findElement(By.id("btnLogin"));
            btnLogin.click();
            Thread.sleep(6000);
            WebElement CreateProject = driver.findElement(By.xpath("//*[@name='create-prj']"));
            CreateProject.click();
            Thread.sleep(5000);
            WebElement Projectname = driver.findElement(By.xpath("//input[@id='txtProjectName']"));
            Projectname.sendKeys("prime target");
            Thread.sleep(5000);
            WebElement btncreateproj = driver.findElement(By.xpath("//button[@id='btnCreate']"));
            btncreateproj.click();
            Thread.sleep(4000);
            WebElement btnclose = driver.findElement(By.xpath("//*[@id='divProjectSettings']/div/div[1]/button"));
            btnclose.click();
            Thread.sleep(5000);
            WebElement pm=driver.findElement(By.xpath("//*[@id='lirfiPunch']/a/span[1]"));
            pm.click();
            Thread.sleep(10000);
            WebElement pt=driver.findElement(By.xpath("//span[contains(text(),'Punch')]"));
            pt.click();
            Thread.sleep(15000);

        }
        public void Createfol() throws InterruptedException, FindFailed, IOException, AWTException {
            WebElement CrtFolder= driver.findElement(By.xpath("//*[@id='aPrjAddFolder']"));
            CrtFolder.click();
            Thread.sleep(5000);
            WebElement CF= driver.findElement(By.xpath("//input[@id='txtFolderName']"));
            CF.sendKeys("Automation Testing");
            WebElement FolCreateSubmit= driver.findElement(By.xpath("//button[@id='btnFolderCreate']"));
            FolCreateSubmit.click();
            WebElement upf=driver.findElement(By.xpath("//button[@id='btnFolderCreateThisFolder']"));
            upf.click();
            Thread.sleep(6000);
            WebElement ChooseFiles1 = driver.findElement(By.xpath("//button[@id='btnSelectFiles']"));
           // WebElement ChooseFiles = driver.findElement(By.xpath("//button[@class='btn btn-primary btnLocalFileUpload']"));
            ChooseFiles1.click();
            Runtime.getRuntime().exec("./Autoit/Upload.exe");
            //Thread.sleep(3000);
            //Robot robot = new Robot();
            //Thread.sleep(3000);
            //robot.keyPress(KeyEvent.VK_TAB);
           //WebElement Dni=driver.findElement(By.xpath("//button[@id='DonotIndexFiles']"));
           //Dni.click();
           //Thread.sleep(7000);



        }

    }









