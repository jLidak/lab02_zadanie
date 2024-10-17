import java.util.Scanner;

public class Register {
    public void registerUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę użytkownika:");
        String username = scanner.nextLine();

        System.out.println("Podaj hasło:");
        String password = scanner.nextLine();

        User user = new User(username, password);

        System.out.println("Rejestracja zakończona sukcesem!");
        System.out.println("Zarejestrowany użytkownik: " + user);
    }

    public static void main(String[] args) {
        Register register = new Register();
        register.registerUser();
    }
}