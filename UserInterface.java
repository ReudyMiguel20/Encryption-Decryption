package encryptdecrypt;

import java.util.Scanner;

public class UserInterface {
    private Encryptor encryptor;
    private Scanner scanner;

    public UserInterface() {
        this.encryptor = new Encryptor();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        String userInput = scanner.nextLine();

        if (userInput.equals("enc")) {
            this.encryptor.encrypt();
        } else if (userInput.equals("dec")) {
            this.encryptor.decrypt();
        }
    }
}
