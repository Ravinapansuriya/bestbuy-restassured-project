package com.bestbuy.testbase;

import com.bestbuy.utils.PropertyReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
        RestAssured.basePath = "/products";

//        RestAssured.baseURI = PropertyReader.getInstance().getProperty("baseUrl");
//        RestAssured.basePath = PropertyReader.getInstance().getProperty("basePath");

    }
}
