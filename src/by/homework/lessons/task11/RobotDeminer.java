package by.homework.lessons.task11;

public class RobotDeminer implements RobotEngineer {
    private final String model;
    private final int powerConsumption;
    private final String deminingTool;
    private final String material;
    private boolean isOn;

    public RobotDeminer(String model, int powerConsumption, String deminingTool, String material) {
        this.model = model;
        this.powerConsumption = powerConsumption;
        this.deminingTool = deminingTool;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void turnOn() {      //проверка состояния робота
        if (!isOn) {            //проверяет, выключен ли робот (isOn = false)
            isOn = true;        //если выключен, включает его (isOn = true) и выводит сообщение об успешном включении.
            System.out.println("Робот сапер включен");
        } else {                //если робот уже включен, выводит уведомление о текущем состоянии.
            System.out.println("Робот сапер уже включен");
        }
    }

    @Override
    public void turnOff() {     //проверка состояния робота
        if (!isOn) {            //проверяет, включен ли робот (isOn = true)
            isOn = false;       //если включен, выключает его (isOn = false) и выводит сообщение
            System.out.println("Робот сапер выключен");
        } else {                //если выключен, выводит уведомление о текущем состоянии.
            System.out.println("Робот сапер уже выключен");
        }
    }

    @Override
    public void showUniqueAbility() {
        System.out.println("Разминирует с помощью " + deminingTool);

    }

    // Переопределяем метод ремонта
    @Override
    public void repair() {
        System.out.println("Робот сапер " + model + " отремонтирован");
    }

    @Override
    public String createItem() {
        return "Приспособление для разминирования Шасси 7";
    }
}

