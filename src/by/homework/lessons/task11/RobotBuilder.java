package by.homework.lessons.task11;

public class RobotBuilder implements RobotEngineer {
    private final String model;
    private final int powerConsumption;
    private final String manufacturerCountry;
    private final String buildingAppliance;
    private boolean isOn;

    public RobotBuilder(String model, int powerConsumption, String manufacturerCountry, String buildingAppliance) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.manufacturerCountry = manufacturerCountry;
        this.buildingAppliance = buildingAppliance;
        this.isOn = false;
    }

    @Override
    public void turnOn() {      //проверка состояния робота
        if (!isOn) {            //проверяет, выключен ли робот (isOn = false)
            isOn = true;        //если выключен, включает его (isOn = true) и выводит сообщение об успешном включении.
            System.out.println("Робот строитель включен");
        } else {                //если робот уже включен, выводит уведомление о текущем состоянии.
            System.out.println("Робот строитель уже включен");
        }
    }

    @Override
    public void turnOff() {     //проверка состояния робота
        if (!isOn) {            //проверяет, включен ли робот (isOn = true)
            isOn = false;       //если включен, выключает его (isOn = false) и выводит сообщение
            System.out.println("Робот строитель выключен");
        } else {                //если выключен, выводит уведомление о текущем состоянии.
            System.out.println("Робот строитель уже выключен");
        }
    }

    @Override
    public void showUniqueAbility() {
        System.out.println("Робот строитель строит с помощью " + buildingAppliance);

    }

    // Переопределяем метод ремонта
    @Override
    public void repair() {
        System.out.println("Робот строитель " + model + " отремонтирован");
    }

    @Override
    public String createItem() {
        return "Робот строитель создаёт бетон";
    }
}
