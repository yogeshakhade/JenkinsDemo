package com.testNG;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

 

public class DataProviderEx1 {

 

    private PrimeTest primeTest;

 

       @BeforeMethod
       public void initialize() {
          primeTest = new PrimeTest();
       }

 

       @DataProvider(name = "test1")
       public static Object[][] primeNumbers() {
          return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
       }

 

       // This test will run 5 times since we have 5 parameters defined
       @Test(dataProvider = "test1")
       public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
          System.out.println(inputNumber + " " + expectedResult);
          Assert.assertEquals(expectedResult,  primeTest.validate(inputNumber));
       }
}