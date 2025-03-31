import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Type;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;



public class DiceSimulation {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);


    System.out.print("Enter your Dice val: ");
    int numberOfDice=scanner.nextInt();




        try{
            System.out.print("Enter your Dice val: ");
            }
        catch (InputMismatchException e) {
            System.out.println("That is not a valid number");
        }


    }

    static String display(int value){
        switch(value){
            case 1 : return "---------\n|       |\n|   o   |\n|       |\n---------";
            case 2 : return "---------\n| o     |\n|       |\n|     o |\n---------";
            case 3 : return "---------\n| o     |\n|   o   |\n|     o |\n---------";
            case 4 : return "---------\n| o   o |\n|       |\n| o   o |\n---------";
            case 5 : return "---------\n| o   o |\n|   o   |\n| o   o |\n---------";
            case 6 : return "---------\n| o   o |\n| o   o |\n| o   o |\n---------";
            default: return "Not a valid Die value";

        }

    }
}
