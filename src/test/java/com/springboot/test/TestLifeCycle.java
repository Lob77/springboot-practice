package com.springboot.test;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.*;

public class TestLifeCycle {

    @BeforeAll
    static void beforeAll(){
        System.out.println("## BeforeAll Annotaion 호출 ##");
        System.out.println();
    }

    @AfterAll
    static void afterAll(){
        System.out.println("## AfterAll Annotaion 호출 ##");
        System.out.println();
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("## BeforeEach Annotaion 호출 ##");
        System.out.println();
    }

    @AfterEach
    void afterEach(){
        System.out.println("## AfterEach Annotaion 호출 ##");
        System.out.println();
    }

    @Test
    void test1(){
        System.out.println("## test1 시작 ##");
        System.out.println();
    }

    @Test
    @DisplayName("Test Case2")
    void test2(){
        System.out.println("## test2 시작 ##");
        System.out.println();
    }

    @Test
    @Disabled
    void test3(){
        System.out.println("## test3 시작 ##");
        System.out.println();
    }

}
