package main;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        int res = sum(150, 15);
        System.out.println(myCar.color);
    }

    public static int sum(int a, int b) {
        a = a * 2;
        return a + b;
    }

}


class Car {
    String color = "Super Car";
    int weight;
    int power;
    int currentSpeed;

    void gas(int speed) {
        currentSpeed = currentSpeed + speed;
    }

    void stop() {
        currentSpeed--;
    }

    void printcurrentSpeed() {
        System.out.println(currentSpeed);
    }

    int getPower() {
        return power + 100;
    }
}


