package com.netcracker.chapter1;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger searchFactorial(int n){
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
