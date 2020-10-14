package com.lgl;

import org.junit.Before;
import org.junit.Test;

public class TestThreadLocal {
    private ThreadLocal<String> map = new ThreadLocal<String>();
    @Before
    public void test00(){
        System.out.println("Before");
        System.out.println(Thread.currentThread());
        map.set("hello");//map.put(Thread.currentThread(),"hello")
    }
    @Test
    public void test01(){
        System.out.println("Test");
        System.out.println(Thread.currentThread());
        System.out.println(map.get());////map.get(Thread.currentThread())
    }
}
