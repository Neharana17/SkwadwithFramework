package org.example.Pages.POM;

import org.example.Base.BasePage;
import org.example.Driver.DriverManger;
import org.example.utils.ProperityReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage_POM extends BasePage {

    public LoginPage_POM(){
        super();
    }
    By signUpPage =By.className("signup");
    By firstNameInput = By.id("firstname");
   By lastnameInput = By.id("lastname");
   By usernameInput = By.id("username");

    By email = By.id("email");
    By passwordInput = By.id("password");
   By confirmpassword = By.id("cpassword");
    By eyeIcon = By.xpath("//*[@id=\"signUpForm\"]/div/div[5]/img");
   By confirmEyeIcon = By.xpath("//*[@id=\"signUpForm\"]/div/div[6]/img");
   By state = By.name("state");
   By zipcode =By.id("zipcode");
   By termsAndConditionsLink = By.id("exampleCheck1");
   By signUpButton = By.xpath("//*[@id=\"signUpForm\"]/div/div[10]/button");

   public void SignupSkwad() throws Exception {
       enterInput(firstNameInput, ProperityReader.readKey("firstNameInput"));
       enterInput(lastnameInput,ProperityReader.readKey("lastnameInput"));
       enterInput(usernameInput,ProperityReader.readKey("usernameInput"));
       enterInput(email,ProperityReader.readKey("email"));
       enterInput(passwordInput,ProperityReader.readKey("passwordInput"));
       enterInput(confirmpassword,ProperityReader.readKey("confirmpassword"));

       enterInput(state,ProperityReader.readKey("state"));
       enterInput(zipcode,ProperityReader.readKey("zipcode"));
       ClickElement(termsAndConditionsLink);
       ClickElement(eyeIcon);
       ClickElement(confirmEyeIcon);
       ClickElement(signUpButton);






   }

}
