public class Main {
    public static void main(String[] args) {

        short minGram = 250;
        short maxGram = 500;
        byte justKilogram = 7;
        int minDay = justKilogram * 1000 / maxGram;
        int maxDay = justKilogram * 1000 / minGram;
        int averageDay = (minDay + maxDay) / 2;
        System.out.println ("Миниум спортсмен может похудеть за " + minDay + " дней, максимум за " + maxDay + " дней. В среднем спортсмен может похудеть за " + averageDay + " дней.");



    }
}