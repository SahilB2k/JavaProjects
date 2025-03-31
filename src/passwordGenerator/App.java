package passwordGenerator;

public class App {

    public static void main(String[] args) {
        UserInterface ui=new TextBasedInterface();
        int length=ui._getPasswordLength();
        boolean useLowercase=ui.useLowerCase();
        boolean useUppercase=ui.useUpperCase();
        boolean useNumbers=ui.useNumbers();
        boolean useSymbols=ui.useSymbols();
        PassGenerator gen =new PassGenerator();
        String password=gen.generatePassword(length,useLowercase,useUppercase,useNumbers,useSymbols);

        ui.displayPassword(password);

    }
}
