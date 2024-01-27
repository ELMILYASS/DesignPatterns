package ChainOfResponsibility;

import ChainOfResponsibility.handlers.Handler;
import ChainOfResponsibility.handlers.RoleCheckHandler;
import ChainOfResponsibility.handlers.UserExistsHandler;
import ChainOfResponsibility.handlers.ValidPasswordHandler;

//Example of Geekific "https://www.youtube.com/c/Geekific"

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService service = new AuthService(handler);

        System.out.println("==========================================");

        System.out.println(service.logIn("username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("user_username", "password"));

        System.out.println("==========================================");

        System.out.println(service.logIn("admin_username", "admin_password"));

        System.out.println("==========================================");
    }
}
