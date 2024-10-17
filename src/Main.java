public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User user = new User("John", "Doe");
        Login login = new Login(user);
        login.login("John", "Doe");
        System.out.println(user.isLoggedIn());

        Register register = new Register();
        register.registerUser();
    }
}