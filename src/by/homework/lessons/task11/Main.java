package by.homework.lessons.task11;

public class Main {
    public  static  void  main (String[] args) {
        //Создаем экземпляры роботов
        RobotCooker cooker = new RobotCooker("CookProf-12", 1200, "Германия", "мультиварка");
        RobotDeminer deminer = new RobotDeminer("DeminerProf-1000", 500, "Шасси 7", "Металл");
        RobotBuilder builder = new RobotBuilder("BuilderProf-777", 2100, "Китай", "бетономешалка");

        //Вызываем метод отремонтировать робота
        cooker.repair();
        deminer.repair();
        builder.repair();

        Robot[] allRobots = {cooker, deminer, builder};
        RobotEngineer[] engineers = {deminer, builder};
        RobotDeminer[] deminers = {deminer};

        System.out.println("------------------------------"); // строка для разделения
        //Демонстрация уникальных возможностей всех роботов
        for (Robot robot : allRobots) {
            robot.turnOn();
            robot.showUniqueAbility();
            robot.turnOff();
            System.out.println("------------------------------"); // строка для разделения
        }
//Демонстрация создания предметов роботами инженерами
        for (RobotEngineer engineer : engineers){
            engineer.turnOn();
            engineer.showUniqueAbility();
            System.out.println(engineer.createItem());
            engineer.turnOff();
            System.out.println("------------------------------"); // строка для разделения
        }
//Демонстрация уникальных возможностей роботов саперов
        for (RobotDeminer deminerRobot : deminers){
            deminerRobot.turnOn();
            deminer.showUniqueAbility();
            deminerRobot.turnOff();
            System.out.println("------------------------------"); // строка для разделения
        }
    }
}
