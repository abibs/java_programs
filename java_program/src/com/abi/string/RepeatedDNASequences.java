package com.abi.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequences {

    public static void main(String[] args) {
        List<String> repeatedString = findrepeatedDNASequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        System.out.println(repeatedString);
    }

    private static List<String> findrepeatedDNASequences(String givenStr) {
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<= givenStr.length()-10;i++){
            String subString = givenStr.substring(i,i+10);
            map.put(subString,map.getOrDefault(subString,0)+1);
        }
        List<String> result = new ArrayList<>();
        for(Map.Entry<String,Integer> item : map.entrySet()){
            if(item.getValue()>1){
                result.add(item.getKey());
            }
        }

    return result;
    }
}
