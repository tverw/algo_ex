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
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.tverw.algoex.StringUtils.asStarField;

/**
 *
 * @author Terhi Verwijnen <terhi.verwijnen@gmail.com>
 */
public class StringUtilsTest {

    public StringUtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of asStarField method, of class StringUtils.
     */
    @Test
    public void testAsStarField() {
        boolean[][] taulukko = new boolean[8][18];
        taulukko = fillWithTrue(taulukko);
        assertEquals("******************\n******************\n******************\n******************\n******************\n******************\n******************\n******************\n", StringUtils.asStarField(taulukko, false));
        assertEquals("  000000000111111111\n" +
"  123456789012345678\n" +
"1 ******************\n" +
"2 ******************\n" +
"3 ******************\n" +
"4 ******************\n" +
"5 ******************\n" +
"6 ******************\n" +
"7 ******************\n" +
"8 ******************\n", StringUtils.asStarField(taulukko, true));
    }

    public boolean[][] fillWithTrue(boolean[][] taulukko) {
        for (int i = 0; i < taulukko.length; i++) {
            for (int j = 0; j < taulukko[i].length; j++) {
                taulukko[i][j] = true;
            }
        }
        return taulukko;
    }

    /**
     * Test of asBinaryString method, of class StringUtils.
     */
    @Test
    public void testAsBinaryString() {
        assertEquals("00000000000000000000000000000000", StringUtils.asBinaryString(0));
        assertEquals("00000000000000000000000000001010", StringUtils.asBinaryString(10));
        assertEquals("00000000000000000000000001100011", StringUtils.asBinaryString(99));
    }

}
