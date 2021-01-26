package test;

/*
@Test
public void (){ assertTrue(BalancedBrackets.hasBalancedBrackets("")) }
    */

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() { assertEquals(true, true); }

    @Test
    public void onlyBracketsReturnsTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); }

    @Test
    /**lower fringe case*/
    public void noBracketsReturnsTrue(){ assertTrue(BalancedBrackets.hasBalancedBrackets("")); }

    @Test
    public void misorderedBracketsReturnsFalse(){ assertFalse(BalancedBrackets.hasBalancedBrackets("][")); }


}//class
