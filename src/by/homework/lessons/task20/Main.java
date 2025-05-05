package by.homework.lessons.task20;

import java.util.*;
import java.util.concurrent.*;


public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3); //Создаём пул из 3 потоков.
        List<Future<List<String>>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {  //Запускаем 10 задач, каждая получает свой taskId.
            futures.add(executor.submit(new FileGeneratorTask(i))); //submit возвращает объект Future, который будет содержать результат задачи.
        }

        for (int i = 0; i < futures.size(); i++) {
            List<String> files = futures.get(i).get();  //Ждём завершения каждой задачи
            System.out.printf("Result of task %d: %s%n", i, files);   //Выводим список созданных файлов.
        }

        executor.shutdown();    //Завершаем работу пула потоков.
    }
}