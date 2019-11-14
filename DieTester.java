public class DieTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the dice simulator.");

        Die d1 = new Die();
        Die d2 = new Die();

        System.out.println("Die 1 = " + d1.getSide());
        System.out.println("Die 2 = " + d2.getSide());

        d1.roll();
        d2.roll();

        System.out.println("Die 1 = " + d1.getSide());
        System.out.println("Die 2 = " + d2.getSide());


    }
}
