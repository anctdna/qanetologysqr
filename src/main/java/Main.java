import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        int firstValue = 200;
        int secondValue = 300;

        SQRService service = new SQRService();
        System.out.println(service.countSqr(200, 300));
    }
}
