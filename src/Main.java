public class Main {
    public static void main(String[] args) {

        byte bananaOneWeight = 80;
        byte bananaQuantity = 5;
        byte milkOneWeight = 105;
        byte milkQuantity = 2;
        byte iceCreamOneWeight = 100;
        byte iceCreamQuantity = 2;
        byte eggOneWeight = 70;
        byte eggQuantity = 4;
        int breakfastGram = bananaOneWeight * bananaQuantity + milkOneWeight * milkQuantity + iceCreamOneWeight * iceCreamQuantity + eggOneWeight * eggQuantity;
        int breakfastKilogram = breakfastGram / 1000;
        System.out.println("Вес завтрака спортсмена составил " + breakfastGram + " грамм, что соответствует " + breakfastKilogram + " килограмм.");


    }
}