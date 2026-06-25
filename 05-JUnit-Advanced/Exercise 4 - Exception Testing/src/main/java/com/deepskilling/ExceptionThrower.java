package com.deepskilling;
public class ExceptionThrower {
    public void throwException(String arg) {
        if (arg == null) {
            throw new IllegalArgumentException("Argument cannot be null");
        }
    }
}
