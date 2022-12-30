public class Main {
    public static void main(String[] args) {

        byte efficiencyTwoMinutes = 16;
        int efficiency = efficiencyTwoMinutes / 2;
        int producedTwentyMinutes = 20 * efficiency;
        int produceDay = 24 * 60 * efficiency;
        int produceThreeDay = 3 * 24 * 60 * efficiency;
        int produceMonth = 30 * 24 * 60 * efficiency;
        System.out.println("За 20 минут машина произвела " +  producedTwentyMinutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " +  produceDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " +  produceThreeDay + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " +  produceMonth + " штук бутылок.");

    }
}