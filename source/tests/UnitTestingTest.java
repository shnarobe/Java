package source.tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import source.UnitTesting;

public class UnitTestingTest {
    @Test
    public void testSum(){
        UnitTesting ut=new UnitTesting();
        assertEquals(6,ut.printSum(4, 2));

   }

   
   @Test
   public void testSum2(){
    UnitTesting ut=new UnitTesting();
    assertNotEquals(0, ut.printSum(3, 4));
   }

   @Test
   public void testSum3(){
    //never test multiple scenarios in one test method...one scenario per test method.
    UnitTesting ut=new UnitTesting();
    assertTrue(ut.printSum(2,3)==9);
    
   }
    
   @Test
   public void testException(){
    UnitTesting ut=new UnitTesting();
    assertThrows(IllegalAccessException.class, ()->{
        ut.except();
    });
   }
}
