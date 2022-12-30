public class Main {
    public static void main(String[] args) {

        byte paintOneClassWhite = 2;
        byte paintOneClassBrown = 4;
        byte paintTotal = 120;
        int paintOneClass = paintOneClassBrown + paintOneClassWhite;
        int classTotal = paintTotal / paintOneClass;
        int paintWhite = classTotal * paintOneClassWhite;
        int paintBrown = classTotal * paintOneClassBrown;
        System.out.println("В школе, где " + classTotal + " классов, нужно " + paintWhite + " банок белой краски и " + paintBrown + " банок коричневой краски.");


    }
}