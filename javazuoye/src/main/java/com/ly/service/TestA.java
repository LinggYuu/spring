package com.ly.service;

import com.ly.pojo.TestB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestA {


    @Autowired
    private TestB testB;

    public TestB getTestB() {
        return testB;
    }

    public void setTestB(TestB testB) {
        this.testB = testB;
    }

    public void print(){
        String name=testB.getClass().getName();
        testB.print(name);
    }




}
