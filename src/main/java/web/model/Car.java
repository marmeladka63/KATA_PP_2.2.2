package web.model;

public class Car {
    private String name;
    private String color;
    private int number;

    public Car(String name, String color, int number) {
        this.name = name;
        this.color = color;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
