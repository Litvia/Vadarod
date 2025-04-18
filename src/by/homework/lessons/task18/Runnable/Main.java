package by.homework.lessons.task18.Runnable;

public class Main {
    private static void runTwoCarsInParallel() {
        Thread car1 = new Thread(new AutoRunnable("Машина1", "5277 JU 5", 500));
        Thread car2 = new Thread(new AutoRunnable("Машина2", "1111 OM 7", 700));

        car1.start();
        car2.start();
    }

    private static void runThreeCarsWithJoin() {
        Thread car1 = new Thread(new AutoRunnable("Машина1", "2358 SW 1", 500));
        Thread car2 = new Thread(new AutoRunnable("Машина2", "4781 GT 7", 700));
        Thread car3 = new Thread(new AutoRunnable("Машина3", "6987 CD 4", 600));

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