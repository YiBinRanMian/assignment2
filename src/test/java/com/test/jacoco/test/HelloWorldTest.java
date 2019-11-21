package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

import java.lang.reflect.Member;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();
    	int a = hw.Method3(6, -1, 1); // tt t
        int b = hw.Method3(3, 1, 2);// ff t
        int c = hw.Method3(6, -1, -1);// tt f
        int d = hw.Method3(6, -1, -1);// tt f
        int e = hw.Method3(3, -1, 2);// ft t
        int f = hw.Method3(6, 1, 2);// tf t
        int g = hw.Method3(5, 9, 0);
        int h = hw.Method3(3, -3, -3);//t t
        int i = hw.Method3(6, -3, -3); //f t
        int j = hw.Method3(3, -3, 0); //t f
    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4(){
        HelloWorld hw = new HelloWorld();
        int a = hw.Method4(0,1,1,1,1);
        int b = hw.Method4(5,5,5,1,1);  // t f t
        int c = hw.Method4(5,5,5,5,1);  // t t t
        int d = hw.Method4(5,1,5,5,1);  // f t t
        int e = hw.Method4(1,1,5,5,1);  // t t f
        int f = hw.Method4(1,1,1,5,1);  // t f f
        try{
            int g = hw.Method4(1,3,1,1,5); //f t f
        }catch (Exception err){
            System.out.println("error");
        }
        try{
            int h = hw.Method4(1,3,1,3,5); //f f f
        }catch (Exception err){
            System.out.println("error");
        }
        try{
            int i = hw.Method4(5,3,1,3,5); //f f t
        }catch (Exception err){
            System.out.println("error");
        }
    }
    @Test
//    b+c>a&&a+c>b&&a+b>c
    public void testisTriangle(){
        HelloWorld hw = new HelloWorld();
        boolean a = hw.isTriangle(3,4,5); //ttt
        boolean b = hw.isTriangle(3,4,1); //tft
        boolean c = hw.isTriangle(4,3,1); //ftt
        boolean d = hw.isTriangle(1,3,4); //ttf
        boolean e = hw.isTriangle(-4,-2,-1); //tff
        boolean f = hw.isTriangle(-2,-4,-1); //ftf
        boolean g = hw.isTriangle(-2,-1,-4); //fft

    }
    @Test
    public void testisBirthday(){
        HelloWorld hw = new HelloWorld();
        int[] condition1 = {1889,3000,2001};
        int[] condition2 = {-1,13,1};
        int[] condition3 = {-1,32,2};
        boolean testloop;
        for(int loopi =0;loopi<=2;loopi++){
            for(int loopj=0;loopj<=2;loopj++){
                for (int loopk=0;loopk<=2;loopk++){
                        testloop = hw.isBirthday(condition1[loopi],condition2[loopj],condition3[loopk]);
                }
            }
        }
        
        boolean h = hw.isBirthday(2019,10,12);    //t t t f
        boolean i = hw.isBirthday(2019,9,1);    //t f
        boolean j = hw.isBirthday(2019,10,1);    //t t t t
        boolean k = hw.isBirthday(2019,11,1);    //t t f t

        boolean l = hw.isBirthday(2016,11,1); //
        boolean m = hw.isBirthday(2016,4,31); //
        boolean n = hw.isBirthday(2016,6,31); //
        boolean o = hw.isBirthday(2016,9,31); //
        boolean p = hw.isBirthday(2016,10,31); //
        boolean q = hw.isBirthday(2016,2,31); //
        boolean r = hw.isBirthday(2016,2,28); //

        boolean s = hw.isBirthday(2000,2,28); //
        boolean t = hw.isBirthday(1999,2,31); //
        boolean u = hw.isBirthday(1999,2,27); //
        boolean v = hw.isBirthday(1999,4,31); //
        boolean w = hw.isBirthday(1999,6,31); //
        boolean x = hw.isBirthday(1999,6,31); //
        boolean y = hw.isBirthday(1999,11,31); //

    }
    @Test
    public void testminiCalculator(){
        HelloWorld hw = new HelloWorld();
        double a = hw.miniCalculator(1.0,1.0,'+');
        assertEquals(2.0,a,0.0);
        double b = hw.miniCalculator(1,1,'-');
        assertEquals(0,b,0);
        double c = hw.miniCalculator(2.1,2,'*');
        assertEquals(4.2,c,0.0);
        double d = hw.miniCalculator(4.4,2,'/');
        assertEquals(2.2,d,0.0);
        double e = hw.miniCalculator(1,0,'/');
        double f = hw.miniCalculator(1,1,'%');

    }


}
