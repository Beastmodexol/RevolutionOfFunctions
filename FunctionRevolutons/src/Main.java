import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//Created by Jeremiah Stabler
//This is a program which takes two funtions and then revolves the first equation around the second.
//Steps, takes dirivitive of the second
//Then make normal line equation
//Then subtract the first equation from the normal
//Use Newton's method to find the x value of intersection
//Plug found x into the first equation and then subtract the second
//Take absolute value and then use are radius
//Store all the volumes into an arraylist
// Sum all volumes
public class Main {
    public static void main(String[] args) {
        //Taking in the formula
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first coefficient of eqution to be revolved.");
        double fourthC = in.nextDouble();
        System.out.println("Enter the first power.");
        double fourthP = in.nextDouble();
        System.out.println("Enter Second coefficient.");
        double thirdC  = in.nextDouble();
        System.out.println("Enter second power.");
        double thirdP = in.nextDouble();
        System.out.println("Enter third coefficient.");
        double secondC = in.nextDouble();
        System.out.println("Enter third power");
        double secondP = in.nextDouble();
        System.out.println("Enter fourth coefficient.");
        double firstC = in.nextDouble();
        System.out.println("Enter fourth power.");
        double firstP = in.nextDouble();
        System.out.println("Enter Y-Intercept.");
        double constant = in.nextDouble();

        System.out.println("Enter the equaiton the first will be revolved around");
        System.out.println("Enter the first coefficient.");
        double fourthC1 = in.nextDouble();
        System.out.println("Enter the first power.");
        double fourthP1 = in.nextDouble();
        System.out.println("Enter Second coefficient.");
        double thirdC1  = in.nextDouble();
        System.out.println("Enter second power.");
        double thirdP1 = in.nextDouble();
        System.out.println("Enter third coefficient.");
        double secondC1 = in.nextDouble();
        System.out.println("Enter third power");
        double secondP1 = in.nextDouble();
        System.out.println("Enter fourth coefficient.");
        double firstC1 = in.nextDouble();
        System.out.println("Enter fourth power.");
        double firstP1 = in.nextDouble();
        System.out.println("Enter Y-Intercept.");
        double constant1 = in.nextDouble();

        System.out.println("Enter starting x.");
        double start = in.nextDouble();
        System.out.println("Enter ending x.");
        double end = in.nextDouble();
       System.out.println("Your first equation is: " + fourthC + "X^"+fourthP + " " + thirdC + "X^"+thirdP + " " + secondC + "X^"+secondP + " "+ firstC + "X^"+ firstP + " " + constant);
        System.out.println("Your second equation is: " + fourthC1 + "X^"+fourthP1 + " " + thirdC1 + "X^"+thirdP1 + " " + secondC1 + "X^"+secondP + " "+ firstC + "X^"+ firstP + " " + constant);

        in.close();

       ArrayList<Double> circleSum = new ArrayList<Double>(Arrays.asList());
       double subdiv = Math.abs(end-start) * 100;
       double x  = start;
       double y = 0;

       //Getting A Dirivitive
        double c4 = fourthC1*fourthP1;
        double p4 = fourthP - 1;
        double c3 = thirdC1*thirdP1;
        double p3 = thirdP1 - 1;
        double c2 = secondC1*secondP1;
        double p2 = secondP1 - 1;
        double c1 = secondC1*secondP1;
        double p1 = secondP1 - 1;

       for (int i=0; i < subdiv; i++){
            y =

           x += 0.01;
       }
    }
}