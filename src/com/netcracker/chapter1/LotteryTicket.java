package com.netcracker.chapter1;

import java.util.ArrayList;

public class LotteryTicket {
    public static String createTicket(){
        int indexDelete = 0;
        String combination = "";
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i < 50; i++){
            numbers.add(i);
        }

        for (int i = 0; i < 6; i++){
            indexDelete = (int)(Math.random()*numbers.size());
            combination += numbers.remove(indexDelete) + " ";
        }

        return combination;
    }
}
