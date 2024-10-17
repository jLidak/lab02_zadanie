public class Login {
    private User user;

    public Login(User user) {
        this.user = user;
    }

    public void login(String login, String password) {
        if(login == this.user.getLogin() && password == this.user.getPassword() ) {
            this.user.setLoggedIn(true);
        }
    }
    public void logout(User user) {
        user.setLoggedIn(false);
    }
}
