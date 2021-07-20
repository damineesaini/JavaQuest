package com.company;

import java.util.HashMap;

public class StringFreq {
    public static void main(String[] atgs) {
        String str = "DamineeSaini";
        int value = 0;
        HashMap<Character, Integer> strFreq = new HashMap();
        char[] chars= str.toCharArray();
        for (char ch : chars) {
            if (strFreq.isEmpty()) {
                strFreq.put(ch, 1);
            } else if (strFreq.containsKey(ch)) {
                value = strFreq.get(ch);
                strFreq.replace(ch, value + 1);
            } else {
                strFreq.put(ch, 1);
            }
        }

        System.out.println("THe frequency of each character is: ");
        System.out.println(strFreq);
//
//        HashMap<Character,Integer> strFreq2 = new HashMap();
//
//        for (char ch:str.toLowerCase().toCharArray()) {
//            if(strFreq2.isEmpty()){
//                strFreq2.put(ch,1);
//            }
//            else if(strFreq2.containsKey(ch)){
//                value = strFreq2.get(ch);
//                strFreq2.replace(ch,value+1);
//            }
//            else {
//                strFreq2.put(ch,1);
//            }
//        }
//
//        System.out.println("THe frequency of each character(not case sensitive) is: ");
//        System.out.println(strFreq2);
    }
}
