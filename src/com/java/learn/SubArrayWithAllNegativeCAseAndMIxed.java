package com.java.learn;

public class SubArrayWithAllNegativeCAseAndMIxed {
    public static void main(String[] args) {
        int[] arr= {-5,-2,-3,-2,-5,-1,5};

        int cur_sum=0,max_sum=arr[0];

        for(int i:arr){
            cur_sum=cur_sum+i;

            if(max_sum<cur_sum)
                max_sum=cur_sum;
            if(cur_sum<0)
                cur_sum=0;
        }
        System.out.println(max_sum);
    }
}

