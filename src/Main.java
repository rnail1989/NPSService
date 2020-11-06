import tech.itpark.npsService.NPSService;

public class Main {
    public static void main(String[] args) {
        NPSService service = new NPSService();
        System.out.println(service.nps(new int[]{2, 3, 10, 9, 5, 7, 7, 5, 3, 1, 10, 10}));
    }
}
