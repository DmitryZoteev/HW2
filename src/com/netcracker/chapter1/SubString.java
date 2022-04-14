package com.netcracker.chapter1;

public class SubString {
    public static void subString(String str) {
        char[] chars = str.toCharArray();
        for (int len = 1; len <= chars.length; len++) {
            for (int i = 0; i <= chars.length - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(chars[k]);
                }
                System.out.println();
            }
        }
    }
}

