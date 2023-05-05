package com.mycompany.app;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;


public class IntegrationTest {

    public App app1= new App();
    public App app2= new App();

    @Test
    public void testOne() {
        Assertions.assertEquals(this.app1.calculator(1,2), this.app1.calculator(2,1));
    }

    @Test
    public void testTwo() {
        Assertions.assertEquals(this.app1.calculator(1,2), this.app1.calculator(7,-4));
    }

    @Test
    public void testThree() {
        Assertions.assertEquals(this.app1.calculator(1,1), this.app1.calculator(2,0));
    }
    
}
