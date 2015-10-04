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

import java.util.Random;

/**
 * A collection of methods for Strings.
 * @author Terhi Verwijnen <terhi.verwijnen@gmail.com>
 */
public class StringUtils {

    /**
     * Returns string of content of a two dimensional boolean array using * to
     * represent true and space to represent false.
     *
     * @param array two-dimensional boolean array.
     * @param printNumbers If true, prints row and column numbers. Maximum
     * supported dimension is 99 in both directions.
     * @return String of stars (*) and spaces depending on whether the
     * corresponding value in array is true or false.
     */
    public static String asStarField(boolean[][] array, boolean printNumbers) {
        String tuloste = "";
        if (printNumbers) {
            tuloste += "  ";
            for (int j = 0; j < array[0].length; j++) {
                tuloste += (j + 1) / 10;
            }
            tuloste += "\n  ";
            for (int j = 0; j < array[0].length; j++) {
                tuloste += (j + 1) % 10;
            }
            tuloste += "\n";
        }
        for (int i = 0; i < array.length; i++) {
            if (printNumbers) {
                if (i < 9) {
                    tuloste += (i + 1) + " ";
                } else {
                    tuloste += i + 1;
                }
            }
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]) {
                    tuloste += "*";
                } else {
                    tuloste += " ";
                }
            }
            tuloste += "\n";
        }
        return tuloste;
    }

    /**
     * Returns a String of the binary representation of a given integer.
     *
     * @param n is an integer for which the binary representation is given. It
     * is interpreted as an unsigned 32-bit integer.
     * @return a 32-character String of the binary representation.
     */
    public static String asBinaryString(int n) {
        String jono = "";

        for (int i = 31; i >= 0; i--) {
            if (n >= Math.pow(2, i)) {
                jono += "1";
                n -= Math.pow(2, i);
            } else {
                jono += "0";
            }
        }
        return jono;
    }

    public static void main(String[] args) {
        boolean[][] taulukko = new boolean[8][18];
        Random r = new Random();
        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {
                taulukko[i][j] = r.nextBoolean();
            }
        }
        System.out.println(asStarField(taulukko, true));
    }

}
