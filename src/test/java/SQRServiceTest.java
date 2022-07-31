import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void sqrCalcExact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.countSqr(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrCalcLessThanX() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.countSqr(0, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sqrCalcMoreThanY() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.countSqr(9802, 10000);

        Assertions.assertEquals(expected, actual);
    }
}
