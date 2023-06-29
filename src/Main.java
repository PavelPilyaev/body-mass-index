public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        // height - Рост в метрах
        // weight - Вес в килограммах

        System.out.println("Индекс массы тела:");
        System.out.println(service.calculate(1.87, 98));

    }
}

