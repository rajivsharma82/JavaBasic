package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here

//       Map<String, String> m1 = new HashMap<>();

        /*
        List of String , there are 4 elements
        start-123
        start-234
        end-123
        end-234
         */

            List<String> list = new ArrayList<>();
            list.add("start-123");
            list.add("start-234");
            list.add("end-123");
            list.add("end-234");


        int size = list.size();
//
        for(int element = 0 ; element < list.size(); element++){
            String elementValue = list.get(element);
            if(elementValue.contains(PracConstant.endString)){
                list.remove(elementValue);
                element -=1;
            }
            System.out.println("list size is  " + list.size());

        }
//            for(String nextElement : list){
//                System.out.println("next element in for loop  " +nextElement);
//
//                if(nextElement.contains("end-")){
//
//                    list.remove(nextElement);
//                    System.out.println("next element in the if loop is " +nextElement);
//                }
//            }


        for(String nextElement : list){

            System.out.println(nextElement);
        }

    }
}
