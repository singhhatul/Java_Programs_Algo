package com.java.learn;

import java.util.HashSet;

public class DuplicateElementsUsingHashSet {
    public static void main(String[] args) {
        int a[]={1,3,5,7,9,3,5,5,6,7,};

        HashSet h= new HashSet();
        for(int i:a){
            if(h.add(i)==false)
                System.out.println(i);
        }
    }
}
