package by.homework.lessons.task11;

public class RobotCooker implements Robot {
    private final String model;
    private final int powerConsumption;
    private final String manufacturerCountry;
    private final String cookingAppliance;
    private boolean isOn;

    public RobotCooker(String model, int powerConsumption, String manufacturerCountry, String cookingAppliance) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.manufacturerCountry = manufacturerCountry;
        this.cookingAppliance = cookingAppliance;
        this.isOn = false;
    }

    @Override
    public void turnOn() {      //проверка состояния робота
        if (!isOn) {            //проверяет, выключен ли робот (isOn = false)
            isOn = true;        //если выключен, включает его (isOn = true) и выводит сообщение об успешном включении.
            System.out.println("Робот повар включен");
        } else {                //если робот уже включен, выводит уведомление о текущем состоянии.
            System.out.println("Робот повар уже включен");
        }
    }

    @Override
    public void turnOff() {     //проверка состояния робота
        if (!isOn) {            //проверяет, включен ли робот (isOn = true)
            isOn = false;       //если включен, выключает его (isOn = false) и выводит сообщение
            System.out.println("Робот повар выключен");
        } else {                //если выключен, выводит уведомление о текущем состоянии.
            System.out.println("Робот повар уже выключен");
        }
    }

    @Override
    public void showUniqueAbility() {
        System.out.println("Робот повар готовит с помощью " + cookingAppliance);

    }

    // Переопределяем метод ремонта
    @Override
    public void repair() {
        System.out.println("Робот повар " + model + " отремонтирован");
    }
}

