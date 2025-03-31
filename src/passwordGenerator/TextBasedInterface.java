package passwordGenerator;
import java.util.Scanner;

public class TextBasedInterface implements UserInterface{
    private Scanner Scanner;
    public TextBasedInterface(){
        this.Scanner=new Scanner(System.in);



    }
    @Override
    public int _getPasswordLength() {
        System.out.print("Please enter the password Length:");
        return Scanner.nextInt();
    }

    @Override
    public boolean useLowerCase() {
        System.out.print("Would you like Lowercase characters?(y/n):");
        return Scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useUpperCase() {
        System.out.print("Would you like Uppercase characters?(y/n):");
        return Scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useNumbers() {
        System.out.print("Would you like to have Numbers in your Password?(y/n):");
        return Scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public boolean useSymbols() {
        System.out.print("Would you like to have Symbols in your password?(y/n):");
        return Scanner.next().equalsIgnoreCase("y");
    }

    @Override
    public void displayPassword(String password) {
        System.out.println("Your password is: "+password);

    }
}
