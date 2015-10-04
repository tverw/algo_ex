/*
 * The MIT License
 *
 * Copyright 2015 Terhi Verwijnen <terhi.verwijnen@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.tverw.algoex;

/**
 * A collection of methods for comparing numbers.
 *
 * @author Terhi Verwijnen <terhi.verwijnen@gmail.com>
 */
public class NumberComparisonUtils {

    /**
     * Compares three integers. If all of them are equal, returns true.
     *
     * @param a The first integer to compare.
     * @param b The second integer to compare.
     * @param c The third integer to compare.
     * @return True, if all integers are equal. False otherwise.
     */
    public static boolean compareThreeIntegers(int a, int b, int c) {
        return a == b && a == c;
    }

    /**
     * Compares two doubles. If both of them are positive and max. 1.0, returns
     * true.
     *
     * @param x The first double to compare.
     * @param y The second double to compare.
     * @return True, if x and y are both between 0 and 1 (both inclusive). False
     * otherwise.
     */
    public static boolean arePositiveAndMaxOne(double x, double y) {
        return x >= 0 && x <= 1 && y >= 0 && y <= 1;
    }

    /**
     * A main method that takes three integers as command line arguments.
     */
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (compareThreeIntegers(a, b, c)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

}
