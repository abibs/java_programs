package com.abi.string;

public class ReversingString {
    public static void main(String[] args) {
        char [] str = reverseGivenString("H E L L O".toCharArray());
        System.out.println(str);

    }

    private static char []  reverseGivenString(char [] str){
         int left= 0;
         int right = str.length-1;
         while(left <right){
             char  temp = str[left];
             str[left] = str[right];
             str[right] = temp;
             left++;
             right--;

         }
        return str;
    }
}
