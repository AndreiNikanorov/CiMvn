import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MaxServiceTest {

    @ParameterizedTest
    @CsvFileSource (files = "src/test/resources/data.csv")

    public void ShouldFindMax (int a, int b, int expected) {
        MaxService service = new MaxService();
        int actual = service.max(a, b);
        Assertions.assertEquals(expected, actual);
    }
}
