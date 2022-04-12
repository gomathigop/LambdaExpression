package com.edu;
import java.util.function.*; 
class GreaterNumberUsingPredicate{
     public static void main(String args[]){
                  //Use Predicate reference to show the lambda expression
                 Predicate<Integer>gt = (i) -> i>10;
              //call test() method to Predicate that returns true or false
             boolean result = gt.test(15);
            System.out.println("Greater than 10 :"+result);
     }
}

