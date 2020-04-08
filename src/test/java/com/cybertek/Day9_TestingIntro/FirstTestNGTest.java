package com.cybertek.Day9_TestingIntro;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGTest {

    @Test
    public void tes1(){
        System.out.println("test one");
    }

    @Ignore
    @Test
    public void tes2() {
        System.out.println("test two");
    }

    @Test
    public void tes3(){
        System.out.println("test three");
}}
