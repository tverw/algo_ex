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
public class NumberComparisonUtilsTest {
    
    public NumberComparisonUtilsTest() {
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
     * Test of compareThreeIntegers method, of class NumberComparisonUtils.
     */
    @Test
    public void testCompareThreeIntegers() {
        assertEquals(true, NumberComparisonUtils.compareThreeIntegers(0, 0, 0));
        assertEquals(false, NumberComparisonUtils.compareThreeIntegers(0, 2, 0));
        assertEquals(false, NumberComparisonUtils.compareThreeIntegers(51, 0, -117));
        assertEquals(true, NumberComparisonUtils.compareThreeIntegers(25, 25, 25));
        assertEquals(false, NumberComparisonUtils.compareThreeIntegers(5, 7, 7));
        assertEquals(false, NumberComparisonUtils.compareThreeIntegers(4, 4, 0));
    }
    
    @Test
    public void TestArePositiveAndMaxOne() {
        assertEquals(true, NumberComparisonUtils.arePositiveAndMaxOne(0.12, 0.45));
        assertEquals(false, NumberComparisonUtils.arePositiveAndMaxOne(-0.01, 0.45));
        assertEquals(true, NumberComparisonUtils.arePositiveAndMaxOne(0, 1));
        assertEquals(false, NumberComparisonUtils.arePositiveAndMaxOne(0.12, 1.01));
        assertEquals(true, NumberComparisonUtils.arePositiveAndMaxOne(0.01, 0.99));
        assertEquals(false, NumberComparisonUtils.arePositiveAndMaxOne(Double.MIN_NORMAL, Double.MAX_VALUE));
    }


}
