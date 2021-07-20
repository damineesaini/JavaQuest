package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class SortInLt {
    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2,3,1,-9,-3,-4,0,90,-4,6,-5));
        int temp;
//        if (arrayList.contains(0))
//        {
//            indexOfZero = arrayList.indexOf(0);
//            for (Integer n:arrayList) {
//                if (n<0){
//                    ntvCount++;
//                }
//            }
//            temp = arrayList.get(ntvCount);

  int j=0;
        for(int i=0; i< arrayList.size();i++) {
            if (arrayList.get(i)<0){
                if(j!=i) {
                    temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
                j++;

            }

        }

        for (int a:arrayList
             ) {
            System.out.print(a+" ");
        }
    }
}
