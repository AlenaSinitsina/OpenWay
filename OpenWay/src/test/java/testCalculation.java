import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class testCalculation {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", delimiter = ';')
    void testCows2(double x, String result) {
        Assertions.assertEquals(Calculator.calculate(x),result);
    }

}
