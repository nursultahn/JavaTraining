import kataTraining.Kata;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;


public class kataTrainingTests {

    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(80), Kata.perimeter(BigInteger.valueOf(5)));
    }
    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(216), Kata.perimeter(BigInteger.valueOf(7)));
    }
    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(14098308), Kata.perimeter(BigInteger.valueOf(30)));
    }
}
