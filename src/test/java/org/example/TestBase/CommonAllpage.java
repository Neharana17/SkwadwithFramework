package org.example.TestBase;

import org.example.Driver.DriverManger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class TestBase {

    @BeforeMethod
    protected  void setup() throws MalformedURLException{
        DriverManger.init();
    }
    @AfterMethod
    protected  void teardown(){
        DriverManger.down();
    }
}
