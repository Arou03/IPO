import java.util.Scanner;

public class Degres {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Donnez une température en Fahrenheit : ");
        float degFar = Float.parseFloat(reader.next());
        float degCel = (degFar - 32) * 5 / 9;
        System.out.println("Cette température équivaut à " + degCel + " degrés Celsius");
    }
}