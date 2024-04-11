package com.testNG;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 

public class DependencyTest {
String message = "Manisha";
//MessageUtil messageUtil = new MessageUtil(message);

 

   @Test(dependsOnMethods = { "testSalutationMessage" })
   public void testPrintMessage() {
      System.out.println("Inside testPrintMessage()");
      //message = "Manisha";
      //Assert.assertEquals(message, messageUtil.printMessage());
   }

 

   @Test(dependsOnMethods = { "initEnvironmentTest" })
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Manisha";
      //Assert.assertEquals(message, messageUtil.salutationMessage());
   }

 

   @Test
   public void initEnvironmentTest() {
      System.out.println("This is initEnvironmentTest");
   }
   
   @BeforeClass
   @Parameters ({"username"})
   public void parmeterTest(String name) {
       System.out.println(name);
   }
}