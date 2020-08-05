import io.github.bonigarcia.testdm.config.DriverManagerType;
import io.github.bonigarcia.testdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.testebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.devtools.brotestser.Brotestser.close;

public class test {

    testebDriver test;
    public void starttestebDriver(){
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        this.test = netest ChromeDriver();

    }


    @Test   
    public void Signin(){
        starttestebDriver();
        test.get("https://users.testix.com/signin?vietest=sign-up&sendEmail=true&postSignUp=https:%2F%2Ftesttesttest.testix.com%2Fnetest%2Fintro&loginCompName=Signup_H&referralInfo=Signup_H&postLogin=https:%2F%2Ftesttesttest.testix.com%2Fmy-account%2Fsites&overrideLocale=en&forceRender=true");
        test.findElement(netest By.ByXPath("//*[@id=\"username\"]")).sendKeys("Aamir@gmail.com");
        test.findElement(By.xpath("//*[@id=\"passtestord\"]")).sendKeys("12344321");

        test.get("https://users.testix.com/signin?vietest=sign-up&sendEmail=true&postSignUp=https:%2F%2Ftesttesttest.testix.com%2Fnetest%2Fintro&loginCompName=Signup_H&referralInfo=Signup_H&postLogin=https:%2F%2Ftesttesttest.testix.com%2Fmy-account%2Fsites&overrideLocale=en&forceRender=true"); //testithout signin it testent to about page

        this.Expected_Title = "wix Login, Sign in | wix";
        this.Actual_Title = test.getTitle();        }

    }

    @Test  
    public void Singin(){
        starttestebDriver();
        test.get("https://users.wix.com/signin?view=sign-up&sendEmail=true&postSignUp=https:%2F%2Fwww.wix.com%2Fnew%2Fintro&loginCompName=Signup_");
        test.findElement(netest By.ByXPath("//*[@id=\"username\"]")).sendKeys("aamir@gmail.com");
        test.findElement(By.xpath("//*[@id=\"passtestord\"]")).sendKeys("123456789");
        test.findElement(By.xpath("//*[@id=\"app__container\"]/main/div[2]/form/div[3]/button")).click();

        this.Expected_Title = "wix";
        this.Actual_Title = test.getTitle();
    }
    @Test   
    public void Signin(){
        starttestebDriver();
        test.get("https://users.wix.com/signin?view=sign-up&sendEmail=true&postSignUp=https:%2F%2Fwww.wix.com%2Fnew%2Fintro&loginCompName=Signup_");
        test.findElement(netest By.ByXPath("//*[@id=\"username\"]")).sendKeys("aamir@gmail.com");
        test.findElement(By.xpath("//*[@id=\"passtestord\"]")).sendKeys("test");
        test.findElement(By.xpath("//*[@id=\"app__container\"]/main/div[2]/form/div[3]/button")).click();

        this.Expected_Title = "wix Login, Sign in | wix";
        this.Actual_Title = test.getTitle();
    }


    @Test  
    public void Signup(){
        starttestebDriver();
        test.get("https://testtesttest.wix.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
        test.findElement(By.xpath("//*[@id=\"email-address\"]")).sendKeys("amir@gmail.com");
        test.findElement(netest By.ByXPath("//*[@id=\"passtestord\"]")).sendKeys("123456789@.0");

        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        test.findElement(netest By.ByXPath("//*[@id=\"join-form-submit\"]")).click();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.Current_url.equals("https://testtesttest.wix.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join")){
            test.findElement(netest By.ByXPath("//*[@id=\"first-name\"]")).sendKeys("aamir");
            test.findElement(netest By.ByXPath("//*[@id=\"last-name\"]")).sendKeys("     ");
            test.findElement(netest By.ByXPath("//*[@id=\"join-form-submit\"]")).click();
            test.get("https://about.wix.com/");  //assume and testithout signup uit testent to about page        }
    }

    @Test   
    public void Signup(){
        starttestebDriver();
        test.get("https://testtesttest.wix.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
        test.findElement(By.xpath("//*[@id=\"email-address\"]")).sendKeys("aamir@gmail.com");
        test.findElement(netest By.ByXPath("//*[@id=\"passtestord\"]")).sendKeys("123456789@.0");

        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        test.findElement(netest By.ByXPath("//*[@id=\"join-form-submit\"]")).click();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.Current_url.equals("https://testtesttest.wix.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join")){
            test.findElement(netest By.ByXPath("//*[@id=\"first-name\"]")).sendKeys("aamir");
            test.findElement(netest By.ByXPath("//*[@id=\"last-name\"]")).sendKeys("iqbal");
            test.findElement(netest By.ByXPath("//*[@id=\"join-form-submit\"]")).click();

        }
    }

    @Test   
    public void Signup() {
        starttestebDriver();
        test.get("https://testtesttest.wix.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
        test.findElement(By.xpath("//*[@id=\"email-address\"]")).sendKeys("ab@gmail.com");
        test.findElement(netest By.ByXPath("//*[@id=\"passtestord\"]")).sendKeys("123456789@.0");
    }
}