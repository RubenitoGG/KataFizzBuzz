package com.cifpcarballeira.katas.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.cifpcarballeira.katas.FizzBuzz.FizzBuzz;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam209
 */
public class TestFizzBuzz {

    public TestFizzBuzz() {
    }

    @Test
    public void Test1devuelve1() {
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(1);
        assertEquals("1", resultado);
    }
    
    @Test
    public void Test2devuelve2(){
        FizzBuzz fb = new FizzBuzz();
        String resultado = fb.getFizzBuzz(2);
        assertEquals("2", resultado);
    }
}
