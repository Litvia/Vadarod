package by.homework.lessons.task17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    private static final String TEXT = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scriptureexamination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had leftimmeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery inaction, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of theboulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the EnglishClub, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.";

    // Метод для записи текста в файл по относительному пути
     public static void writeToFileRelative() {
        try (FileWriter writer = new FileWriter("relative_path.txt")) {
            writer.write(TEXT);
            System.out.println("Текст записан в файл relative_path.txt");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    // Метод для записи текста в файл по абсолютному пути
    public static void writeToFileAbsolute() {
        String absolutePath = "/C:/Vadarod/Vadarod/absolute_path.txt";
         try (FileWriter writer = new FileWriter(absolutePath)) {
            writer.write(TEXT);
            System.out.println("Текст записан в файл " + absolutePath);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    // Метод для чтения текста из файла по относительному пути
    public static void readFromFileRelative() {
        try (BufferedReader reader = new BufferedReader(new FileReader("relative_path.txt"))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Текст из файла relative_path.txt: " + content);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из файла: " + e.getMessage());
        }
    }

    // Метод для чтения текста из файла по абсолютному пути
    public static void readFromFileAbsolute() {
        String absolutePath = "/C:/Vadarod/Vadarod/absolute_path.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(absolutePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Текст из файла " + absolutePath + " : " + content);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из файла: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        writeToFileRelative();
        writeToFileAbsolute();
        readFromFileRelative();
        readFromFileAbsolute();
    }
}