package basic.car;

public class Car2 {

    // геттеры / сеттеры
    private String color;
    private String name;
    private int seatsCount;
    private String type;
    private double engineVolume;
    private int wheelsCount;
    private String driveType;
    private boolean hasForkop;
    private Wheel[] wheels = new Wheel[4];
    private int position = 0;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals(""))
            return;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public boolean getHasForkop() {
        return hasForkop;
    }

    void startEngine() {
        System.out.println("Машина заведена...");
    }

    void stopEngine() {
        System.out.println("Машина выключена...");
    }

    void drive(int velocity) {
        position = position + velocity;
        System.out.println("Машина едет");
    }

    void park(String type) {
        position = 0;

        if (type.equals("Параллельно")) {
            System.out.println("Машина припаркована параллельно!");
        } else {
            System.out.println("Машина припаркована перпендикулярно!");
        }
    }

    void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    int getCurrentPosition() {
        return position;
    }

    void setWheelRadius(int radius) throws Exception {
        if (radius <= 0) {
            throw new Exception("Радиус должен быть больше 0");
        }

        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
            wheels[i].radius = radius;
        }
    }

    void printWheelRadiuses() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Радиус колеса №" + i + " = " + wheels[i - 1].getRadius());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public String getDriveType() {
        return driveType;
    }

    public boolean isHasForkop() {
        return hasForkop;
    }

    public void setHasForkop(boolean hasForkop) {
        this.hasForkop = hasForkop;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
