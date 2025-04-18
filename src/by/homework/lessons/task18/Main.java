package by.homework.lessons.task18;

public class Main {

    private static void runTwoCarsInParallel() {
        Auto car1 = new Auto("Машина1", "5277 JU 7", 500);
        Auto car2 = new Auto("Машина2", "1426 PL 7", 700);

        car1.start();
        car2.start();
    }

    private static void runThreeCarsWithJoin() {
        Auto car1 = new Auto("Машина1", "4789 DD 7", 500);
        Auto car2 = new Auto("Машина2", "2456 KH 7", 700);
        Auto car3 = new Auto("Машина3", "4578 LS 7", 600);

        try {
            car1.start();
            car1.join();

            car2.start();
            car3.start();

            car2.join();
            car3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        runTwoCarsInParallel();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        runThreeCarsWithJoin();
    }
}