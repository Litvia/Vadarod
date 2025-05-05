package by.homework.lessons.task19;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Используем лямбду для преобразования строки в верхний регистр
        StringProcessor toUpperCase = (input) -> input.toUpperCase();

        City city1 = new City(1, "Moscow", 12_000_000, Continent.EUROPE);
        City city2 = new City(2, "New York", 8_500_000, Continent.NORTH_AMERICA);
        City city3 = new City(3, "Astana", 1_500_000, Continent.ASIA);
        City city4 = new City(4, "Minsk", 2_000_000, Continent.EUROPE);
        City city5 = new City(5, "Sydney", 5_000_000, Continent.AUSTRALIA);
        City city6 = new City(6, "Tokyo", 14_000_000, Continent.ASIA);

        List<City> cities = Arrays.asList(city1, city2, city3, city4, city5, city6);

            // 1.2 Самый населённый город в Европе
            City maxPopEurope = cities.stream() //cities.stream() - создаёт поток (stream) из списка городов.
                    .filter(c -> c.getContinent() == Continent.EUROPE)  // оставляет только те города, которые находятся в Европе.
                    .max(Comparator.comparingInt(City::getPopulation))  //среди оставшихся выбирает город с минимальным населением.
                    .orElse(null);  //если городов в Европе нет, возвращает null.

            // 1.3 Город с минимальным населением в Европе
            City minPopEurope = cities.stream()
                    .filter(c -> c.getContinent() == Continent.EUROPE)
                    .min(Comparator.comparingInt(City::getPopulation))
                    .orElse(null);  //если городов в Европе нет, возвращает null.

            // 1.4 Самый населённый город в мире
            City maxPopGlobal = cities.stream() //поток создаётся из всех городов.
                    .max(Comparator.comparingInt(City::getPopulation))  //сразу ищется город с максимальным населением (без фильтра по континенту).
                    .orElse(null);  //если городов нет, возвращает null.

            // 1.5 Город с самым маленьким населением
            City minPopGlobal = cities.stream()
                    .min(Comparator.comparingInt(City::getPopulation))
                    .orElse(null);  //если городов в Европе нет, возвращает null.

            // 1.6 Первый город с населением > 1 млн
            City firstOverMillion = cities.stream()
                    .filter(c -> c.getPopulation() > 1_000_000) //поток фильтрует города с населением больше 1 миллиона.
                    .findFirst()    //.findFirst() - берёт первый подходящий город.
                    .orElse(null);  //если такого города нет, возвращается null.

            // 1.7 Все города с населением > 1 млн
            List<City> citiesOverMillion = cities.stream()
                    .filter(c -> c.getPopulation() > 1_000_000) //поток фильтрует города с населением больше 1 миллиона.
                    .collect(Collectors.toList());  //.collect(Collectors.toList()) - собирает их в новый список.

            // 1.8 Коллекция названий городов
            List<String> cityNames = cities.stream()
                    .map(City::getName) //поток преобразует каждый объект City в его название (getName()).
                    .collect(Collectors.toList());  //собирает все названия в список строк.

        // Выводим результаты
        System.out.println("Самый населённый город в Европе: " + maxPopEurope);
        System.out.println("Город с минимальным населением в Европе: " + minPopEurope);
        System.out.println("Самый населённый город в мире: " + maxPopGlobal);
        System.out.println("Город с самым маленьким населением: " + minPopGlobal);
        System.out.println("Первый город с населением > 1 млн: " + firstOverMillion);
        System.out.println("Все города с населением > 1 млн: " + citiesOverMillion);
        System.out.println("Названия всех городов: " + cityNames);
    }
}