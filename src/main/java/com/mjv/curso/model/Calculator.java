package com.mjv.curso.model;

import com.mjv.curso.util.UtilCalculator;

public class Calculator {
    UtilCalculator utilCalculator = new UtilCalculator();
    User user = new User();

    public void crazyCalculator(){
       utilCalculator.form(user);
    }
}
