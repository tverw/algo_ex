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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Terhi Verwijnen <terhi.verwijnen@gmail.com>
 */
public class MyMathTest {

    public MyMathTest() {
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
     * Test of lg method, of class MyMath.
     */
    @Test
    public void testLg() {
        assertEquals(2, MyMath.lg(4));
        assertEquals(4, MyMath.lg(17));
        assertEquals(6, MyMath.lg(68));
        assertEquals(12, MyMath.lg(4200));
    }

    /**
     * Test of lg_rec method, of class MyMath.
     */
    @Test
    public void testLg_rec() {
        assertEquals(2, MyMath.lg_rec(4));
        assertEquals(4, MyMath.lg_rec(17));
        assertEquals(6, MyMath.lg_rec(68));
        assertEquals(12, MyMath.lg_rec(4200));
    }

    /**
     * Test of histogram method, of class MyMath.
     */
    @Test
    public void testHistogram() {
        assertArrayEquals(new int[]{4, 3, 1}, MyMath.histogram(new int[]{0, 0, 0, 1, 2, 1, 1, 0}, 3));
        assertArrayEquals(new int[]{1,3,1,1,2,2,1}, MyMath.histogram(new int[]{0,1,4,1,7,4,5,2,3,6,1,5}, 7));
    }
}
