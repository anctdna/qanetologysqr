import ru.netology.sqr.SQRService;

public class Main {

    public static void main(String[] args) {

        int a = 200;
        int b = 300;

        SQRService service = new SQRService();
        System.out.println(service.countSqr(200, 300));
    }
}
