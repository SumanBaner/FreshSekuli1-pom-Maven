import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;

import java.awt.*;
import java.io.IOException;

public class Driver {

    public static void main(String[] args) throws InterruptedException, FindFailed, IOException, AWTException {
        MethodRepository mr = new MethodRepository();

        //mr.browserApplicationLaunch("chrome","https://www.automationpractice.pl/index.php?controller=my-account");

        //mr.browserApplicationLaunch("chrome","https://www.automationpractice.pl/index.php?controller=my-account");
        // mr.loginInApplication();
        //mr.browserApplicationLaunch("chrome", "https://www.saucedemo.com");
        //mr.loginInApplication();

        //mr.browserApplicationLaunch("edge","https://app.skysite.com");
        // mr.loginInApplication();

        // mr.browserApplicationLaunch("chrome","https://www.ishipdocs.com/ishipdocs/Secure/Login.aspx");
        //mr.loginInApplication();
        //mr.browserApplicationLaunch("chrome","https://app.arcfacilities.com");
        //mr.loginInApplication();
        //mr.loginWithRobotClass();
        //mr.iframeHandling();
        //mr.ScrollDown();
        //mr.scrollUp();
        //mr.multipleWindowHandling();
        // mr.Multab();
       // mr.loginWithSikuli();
        //mr.fileUploadWithAutoIt();
        //mr.popups();
        //mr.fileUploadWithdemoAutoIt();
       //mr.skyfileUploadWithAutoIt();
        //mr.skyfileMulUploadWithAutoIt();
        //mr.dragdrop();
        mr.CreateProj();
        //mr.Createfol();
    }
}
