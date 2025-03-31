package passwordGenerator;

public interface UserInterface {
    public int _getPasswordLength();
    public boolean useLowerCase();
    public boolean useUpperCase();
    public boolean useNumbers();
    public boolean useSymbols();
    public void displayPassword(String password);

}
