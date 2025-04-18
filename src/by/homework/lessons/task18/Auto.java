package by.homework.lessons.task18;

public class Auto extends Thread {
    private final String name;
    private final String stateNumber;
    private final int stopTime; // время остановки в миллисекундах

    public Auto(String name, String stateNumber, int stopTime) {
        this.name = name;
        this.stateNumber = stateNumber;
        this.stopTime = stopTime;
    }

    @Override
    public void run() {
        drive();
    }

    private void drive() {
        System.out.println(name + " с номером " + stateNumber + " начинает движение.");
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " едет... шаг " + i);
            try {
                Thread.sleep(stopTime); // машина "останавливается" на stopTime мс
            } catch (InterruptedException e) {
                System.out.println(name + " был прерван.");
                return;
            }
        }
        System.out.println(name + " закончил движение.");
    }
}