package com.abc;

/**
 * @author abc
 */
public class PassingGrade {
    private static final  float MIN = 1.0f;
    private static final  float MAX = 10.0f;
    public boolean passed(float grade) {
        if (grade < MIN || grade > MAX) {
            throw new IllegalArgumentException();
        }
        return grade >= 5.0;
    }
}
