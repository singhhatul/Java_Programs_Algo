package com.java.learn;

import java.util.HashMap;

public class DuplicateElementsUsingHashMap {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9, 3, 5, 5, 6, 7,};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : a) {
            if (!hm.containsKey(i))
                hm.put(i, 1);
            else
                hm.put(i, hm.get(i) + 1);
        }
        for(int j: hm.keySet()){
            if(hm.get(j)>1)
                System.out.println(j+" count - "+hm.get(j));
        }
    }
}
