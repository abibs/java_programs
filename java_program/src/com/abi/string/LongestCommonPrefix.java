package com.abi.string;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strArray = {"flow", "flower", "flight"};
        String prefix = findLongestCommonPrefix(strArray);
        System.out.println(prefix);
    }

    private static String findLongestCommonPrefix(String[] strArray) {
        if(strArray.length == 0) return "";
        String prefix = strArray[0];
        for(int i =1; i< strArray.length;i++){
            while(!strArray[i].startsWith(prefix)){
               prefix = prefix.substring(0,prefix.length()-1);
               if(prefix.isBlank()) return "";
            }

        }
        return prefix;
    }
}
