package by.homework.lessons.task21;

import java.time.LocalDate; //LocalDate - класс для работы с датой (год, месяц, день) без времени.
import java.time.LocalDateTime; //LocalDateTime - класс для работы с датой и временем (год, месяц, день, часы, минуты, секунды).
import java.time.format.DateTimeFormatter;  //DateTimeFormatter - класс для форматирования и разбора дат/времени в строку и обратно.
import java.util.Locale;    //Locale - класс для задания локализации.

public class Main {
    public static void main(String[] args) {
        // 1. Текущая дата в формате "1 апреля 2023"
        LocalDate currentDate = LocalDate.now();    //получаем сегодняшнюю дату.
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("ru")); //создаём нужный шаблон и локализацию (русский).
        String formattedDate = currentDate.format(dateFormatter);   //преобразуем дату в строку по заданному шаблону.


        System.out.println("1: " + formattedDate);  //выводим результат в консоль

        // 2. Текущая дата и время в формате "1 апреля 2023, 10:59:20 PM"
        LocalDateTime now = LocalDateTime.now();    //получаем сегодняшнюю дату.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a", new Locale("ru")); //создаём нужный шаблон и локализацию (русский).
        String formattedDateTime = now.format(dateTimeFormatter);   //преобразуем дату в строку по заданному шаблону.
        System.out.println("2: " + formattedDateTime);

        // 3. String (2023-03-19 : 10:12:24 AM) -> LocalDateTime
        String input1 = "2023-03-19 : 10:12:24 AM"; //input1 - строка с датой и временем в заданном формате.
        DateTimeFormatter inputFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a"); // шаблон точно соответствует формату строки.
        LocalDateTime dateTime1 = LocalDateTime.parse(input1, inputFormatter1); //разбираем строку в объект LocalDateTime.
        System.out.println("3: " + dateTime1);

        // 4. String (пн 20.03.23 г. время: 15:07:28) -> LocalDateTime
        String input2 = "пн 20.03.23 г. время: 15:07:28";   //input2 - строка с русскими сокращениями дня недели и дополнительным текстом.
        DateTimeFormatter inputFormatter2 = DateTimeFormatter.ofPattern("E dd.MM.yy 'г. время:' HH:mm:ss", new Locale("ru"));
//        Шаблон:
//        E - сокращённое название дня недели (пн, вт, ср и т.д.).
//        'г. время:' - текст, который должен быть точно таким же в строке.
//        dd.MM.yy - день, месяц, год (2 цифры).
//        HH:mm:ss - часы (24-часовой формат), минуты, секунды.
        LocalDateTime dateTime2 = LocalDateTime.parse(input2, inputFormatter2);
        System.out.println("4: " + dateTime2);

        // 5. Текущая дата в формате "понедельник 20 марта 2023 время: 11.54.06 PM"
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy 'время:' hh.mm.ss a", new Locale("ru"));
//        Шаблон:
//        EEEE - полное название дня недели (понедельник, вторник и т.д.).
//        'время:' - текст, который будет выведен как есть.
//         hh.mm.ss a - время (часы, минуты, секунды через точку, AM/PM).
        String customFormatted = now.format(customFormatter);
        System.out.println("5: " + customFormatted);
    }
}