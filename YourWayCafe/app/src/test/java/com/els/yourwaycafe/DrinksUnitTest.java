package com.els.yourwaycafe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by ericaschulz on 7/6/16.
 */
public class DrinksUnitTest {

    @Test

    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void DrinksNotNull() throws Exception {

        String Drinks = "Drinks";
        assertNotNull("Drinks", Drinks);

    }


}
