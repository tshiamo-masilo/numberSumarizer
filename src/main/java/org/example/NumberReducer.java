package org.example;

import java.math.BigInteger;

public class NumberReducer {
    String numberCounter = "";
    BigInteger num;

    String reducedNumber = "";
    NumberReducer(BigInteger input){
        num = input;
        try{
            //try convert the number within parameter
            numberCounter = input.toString();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    private String makeReducedNumber(){
        String reducedNumber = "";
        switch(numberCounter.length()){
            case 1,2,3:
                reducedNumber = numberCounter.substring(0,1)+","+numberCounter.substring(1,2)+ "k";
                break;
            case 4,5,6:
                reducedNumber = numberCounter.charAt(0)+","+numberCounter.substring(1,2) + "k";
                break;
            case 7,8,9:
                reducedNumber = numberCounter.substring(0,1)+","+numberCounter.substring(1,2) + "m";
                break;
            case 10,11,12:
                reducedNumber = numberCounter.substring(0,1)+","+numberCounter.substring(1,2) + "b";
                break;
            default:
                reducedNumber = numberCounter;
                break;

        }

        return reducedNumber;
    }

    public void printNumber(){
        reducedNumber=makeReducedNumber();
        System.out.println(reducedNumber);
    }

    public String getNumber(){
        reducedNumber=makeReducedNumber();
        if(reducedNumber !=""){
            return reducedNumber;
        }else{
            return "Invalid";
        }
    }
}
/*
100 = num
1000 - 100 000 = [first 2 nums + k]
1 000 000 -  000 000 000 [first 2 nums + m]
1 000 000 000 -  000 000 000 000


9 223 372 036 854 775 807





 */
