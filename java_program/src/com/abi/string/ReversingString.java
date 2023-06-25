package com.abi.string;

public class ReversingString {
    public static void main(String[] args) {
        char [] res = reverseGivenString("H E L L O".toCharArray());
        System.out.println(res);

    }

    private static char []  reverseGivenString(char [] str){
         char [] res = str;
         int left= 0;
         int right = res.length-1;
         while(left <right){
             char  temp = res[left];
             res[left] = res[right];
             res[right] = temp;
             left++;
             right--;

         }
        return res;
    }
}
