package com.abc;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    private static Pattern YYYYMMDD_PATTERN = Pattern.compile("(19[0-9][0-9]|20[0-9][0-9])(0[1-9]|1[012])(0[1-9]|[12][0-9]|[3][01])");


    @Property
    public void dateTest(@ForAll @IntRange(min = 1900, max = 2099) int year,
                         @ForAll @IntRange(min = 1, max = 12) int month,
                         @ForAll @IntRange(min = 1, max = 31) int day) {
        String d = String.format("%1$4d%2$2d%3$2d", year, month, day).replace(' ', '0');
        Matcher dateMatcher = YYYYMMDD_PATTERN.matcher(d);
        assertThat(dateMatcher.find()).isTrue();
    }

    @Property
    void invalid(@ForAll("invalidYear") Integer year,
                 @ForAll("invalidMonth") Integer mm,
                 @ForAll("invalidDay") Integer dd) {

        String d = String.format("%1$4d%2$2d%3$2d", year, mm, dd).replace(' ', '0');
        Matcher dateMatcher = YYYYMMDD_PATTERN.matcher(d);

        assertThat(dateMatcher.find()).isFalse();
    }

    @Provide
    private Arbitrary<Integer> invalidYear() {
        return Arbitraries.oneOf(
                Arbitraries.integers().between(0, 1899),
                Arbitraries.integers().between(2100, 9999));
    }

    @Provide
    private Arbitrary<Integer> invalidMonth() {
        return Arbitraries.oneOf(
                Arbitraries.integers().between(0, 0),
                Arbitraries.integers().between(13, 99));
    }

    @Provide
    private Arbitrary<Integer> invalidDay() {
        return Arbitraries.oneOf(
                Arbitraries.integers().between(0, 0),
                Arbitraries.integers().between(32, 99));
    }

    public static void main(String[] args) {
        String d = String.format("%4d%2$2d%3$2d", 1900, 1, 1).replace(' ', '0');
        System.out.println(d);
        String s = String.format("%1$2d%2$2d", 2, 3);//.replace(' ', '0');
        System.out.println(s);
    }

}
