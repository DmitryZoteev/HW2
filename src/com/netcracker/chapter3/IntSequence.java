package com.netcracker.chapter3;

import java.util.Arrays;
import java.util.NoSuchElementException;

public interface IntSequence {
    int next();

    default boolean hasNext(){
        return true;
    }

    static IntSequence of(int... values) {
        return new IntSequence() {

            int[] elements = Arrays.copyOf(values, values.length);
            int index;

            @Override
            public int next() {
                if (index < elements.length) {
                    return elements[index++];
                } else {
                    return 0;
                }
            }

            @Override
            public boolean hasNext() {
                return index < elements.length;
            }
        };
    }

    static IntSequence constantLambda(int i) {
        return () -> i;
    }

    static IntSequence constant(int i) {
        return new IntSequence() {
            int value = i;

            @Override
            public int next() {
                return value;
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        };
    }
}
