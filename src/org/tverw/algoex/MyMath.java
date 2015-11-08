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
 * A collection of methods for mathematics.
 *
 * @author Terhi Verwijnen <terhi.verwijnen@gmail.com>
 */
public class MyMath {
    
    /**
     * Returns the largest integer not larger than log2 for given integer.
     * @param n The given integer.
     * @return The result as integer.
     */
     public static int lg(int n) {
        int tulos = 0;
        
        while (n > 1) {
            n /= 2;
            tulos++;
        }
        
        return tulos;
    }
    
     /**
     * Returns the largest integer not larger than log2 for given integer recursively.
     * @param n The given integer.
     * @return The result as integer.
     */
    public static int lg_rec(int n) {
        if (n == 1) {
            return 0;
        } else {
            return 1 + lg_rec(n/2);
        }
    }
    
}
