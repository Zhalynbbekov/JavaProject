import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Director director = new Director("Umut","123");
        Delivery delivery = new Delivery("Ilyaz", "1234");
        Zavkhoz zavkhoz = new Zavkhoz("Zhantai", "12345");
        System.out.println("Log in or register?");
        String loginOrRegister = scan.nextLine();
        if(loginOrRegister.equals("login")){
            System.out.println("Enter a type of your account: ");
            String type = scan.nextLine();
            if(type.equals("director")){
                director.login();
            }
            else if(type.equals("delivery")){
                delivery.login();
            }
            else if(type.equals("zavkhoz")){
                zavkhoz.login();
            }else{
                System.out.println("We can't find that kind of account.\n Try again");
            }
        }else if(loginOrRegister.equals("register")){
            System.out.println("Enter a type of your account: ");
            String registerType = scan.nextLine();
            if(registerType.equals("zavkhoz")){
                zavkhoz.register();
            }
            else if(registerType.equals("director")){
                director.register();
            }
            else if(registerType.equals("delivery")){
                delivery.register();
            }else{
                System.out.println("We can't find that kind of account.\n Try again");
            }
        }
    }
}

