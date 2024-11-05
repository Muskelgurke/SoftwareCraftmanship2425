import org.example.Calculator;
import org.example.RunLengthEncoder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestCasesOfRunLengthEncoder {
    @Test
    void TestCase1(){
        int[] TestArray={2};
        int[] expectedValue = {2, 1};
        Assertions.assertArrayEquals(expectedValue, RunLengthEncoder.encode(TestArray));

    }
    @Test
    void TestCase0(){
        int[] TestArray={};
        int[] expectedValue = {};
        Assertions.assertArrayEquals(expectedValue, RunLengthEncoder.encode(TestArray));
    }
    @Test
    void TestCase2(){
        int[] TestArray={2,2};
        int[] expectedValue = {2, 2};
        Assertions.assertArrayEquals(expectedValue, RunLengthEncoder.encode(TestArray));
    }
    @Test
    void TestCase3(){
        int[] TestArray={2,2,2};
        int[] expectedValue = {2, 3};
        Assertions.assertArrayEquals(expectedValue, RunLengthEncoder.encode(TestArray));
    }
    @Test
    void TestCase4(){
        int[] TestArray={2,2,2,2};
        int[] expectedValue = {2, 4};
        Assertions.assertArrayEquals(expectedValue, RunLengthEncoder.encode(TestArray));
    }
    @Test
    void TestCase5(){
        int[] TestArray={2,2,2,2,3};
        int[] expectedValue = {2,4,3,1};
        Assertions.assertArrayEquals(expectedValue, RunLengthEncoder.encode(TestArray));
    }
    @Test
    void TestCase6(){
        int[] TestArray={2,2,2,2,3,3};
        int[] expectedValue = {2,4,3,2};
        Assertions.assertArrayEquals(expectedValue, RunLengthEncoder.encode(TestArray));
    }
    @Test
    void TestCase7(){
        int[] TestArray={2,2,2,2,3,3,7};
        int[] expectedValue = {2,4,3,2,7,1};
        Assertions.assertArrayEquals(expectedValue, RunLengthEncoder.encode(TestArray));
    }
    @Test
    void TestCase8(){
        int[] TestArray={2,2,2,2,3,3,7,2};
        int[] expectedValue = {2,4,3,2,7,1,2,1};
        Assertions.assertArrayEquals(expectedValue, RunLengthEncoder.encode(TestArray));
    }
    @Test
    void TestCase9(){
        int[] TestArray={2,2,2,2,3,3,7,2,2};
        int[] expectedValue = {2,4,3,2,7,1,2,2};
        Assertions.assertArrayEquals(expectedValue, RunLengthEncoder.encode(TestArray));
    }
}
