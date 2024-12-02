import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.TDDRunLengthEncoder;

public class TestCasesTDDrunLengthEncoder {
    @Test
    void testReturnData(){
        int[] TestArray={};
        int[] expected ={};
        Assertions.assertArrayEquals(expected,TDDRunLengthEncoder.encode(TestArray));
    }
    @Test
    void testEncodeValueLength1(){
        int[] TestArray={2};
        int[] expected ={2,1};
        Assertions.assertArrayEquals(expected,TDDRunLengthEncoder.encode(TestArray));
    }


}
