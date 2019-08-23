
package main;

import java.util.Scanner;

public class Gravity {
    public static void main(String[] args) {
        double g = 9.8;
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextDouble();
        double speed = g * time;
        double distance = 0.5 * g * (time * time);
        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the release is " + distance);
    }

}
