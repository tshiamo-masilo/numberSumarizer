package org.example;

import java.math.BigInteger;

public class NumberReducer {
    String numberCounter = "";
    NumberReducer(BigInteger input){
        try{
            //try convert the number within parameter
            numberCounter = input.toString();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    String getReducedNumber(){
        String reducedNumber = "";

        return "";
    }
}
