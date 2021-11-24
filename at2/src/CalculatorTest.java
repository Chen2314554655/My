import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

//    @Test
//    void add() {
//        assertEquals(3,Calculator.add(1,2));
//    }


// @Test
////void testaddIntMsg(){
////    assertEquals(3,Calculator.add(1,2),"add two");
//}

//    @Test
//    void testaddIntMultiple(){
//        assertEquals(3,Calculator.add(1,2),"Test 1");
//        assertEquals(3,Calculator.add(0,2),"Test 2");
//        assertEquals(3,Calculator.add(-1,-2),"Test 3");}
//
//}

//@Test
//void testaddIntMsg() {
//    assertAll("Test all add functions",
//            ()->assertEquals(3,Calculator.add(1,2)),
//            ()->assertEquals(3,Calculator.add(0,2)),
//            ()->assertEquals(3,Calculator.add(-1,-2)));
//}

//    @Test
//    void testDivide(){
//        assertEquals(3.333,Calculator.divide(10,3), 0.001);
//    }

    @Test
    void testDivideThrow(){
        assertThrows(ArithmeticException.class,
                ()->Calculator.divide(1,2));
    }

}
