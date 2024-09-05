package com.gabriel;

import com.gabriel.exercise1.Exercise1;
import com.gabriel.exercise2.Exercise2;
import com.gabriel.exercise3.Exercise3;
import com.gabriel.exercise4.Exercise4;
import com.gabriel.exercise5.Exercise5;

public class Main {
    public static void main(String[] args) {
     Exercise1.execute();
     Exercise2.execute();
        try {
            Exercise3.execute();
        }catch (Exception e) {
            e.printStackTrace();
        }
        Exercise4.execute();
        Exercise5.execute();
    }

}