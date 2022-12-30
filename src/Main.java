public class Main {
    public static void main(String[] args) {

        byte studentsOfLyudmilaPavlovna = 23;
        byte studentsOfAnnaSergeevna = 27;
        byte  studentsOfEkaterinaAndreevna = 30;
        short sheetsOfPaperTotal = 480;
        int sheetsStudent = sheetsOfPaperTotal /(studentsOfLyudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + sheetsStudent  + "  листов бумаги.");
    }
}