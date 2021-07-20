package com.company;

public class SortInLt {
    public static void main(String[] args){
        int[] arr = {2,3,1,-9,-3,-4,0,90,-4,6,-5};

        int temp;

        for(int i=0;i< arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i=-1;
            }
            System.out.println("\n after iteration "+i);
            for (int a:arr) {
                System.out.print(a+" ");
            }

        }

        System.out.println("\n Final output: ");
        for (int a:arr) {
            System.out.print(a+" ");
        }
    }
}
