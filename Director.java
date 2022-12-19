import java.util.Scanner;
public class Director {
    Scanner scan = new Scanner(System.in);
    private String login;
    private String password;

    public Director(String login, String password){
        this.login = login;
        this.password = password;
    }

    public Director(Director source){
        this.login = source.login;
        this.password = source.password;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setLogin(String login){
        this.login=login;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public void login(){
            System.out.println("Enter your login: ");
            String log = scan.nextLine();
            System.out.println("Enter a password: ");
            String pass = scan.nextLine();
            if(log.equals(this.getLogin()) && pass.equals(this.getPassword())){
                System.out.println("Hello, dear Director!");
                System.out.println("Enter a number to work: ");
                System.out.println("1. Show list of equipment (Shows a list of equipment that is in the educational center)");
                System.out.println("2. Show number of equipment (Shows the number of equipment by category)");
                System.out.println("3. Show equipment with the highest number");
                System.out.println("4. Show equipment with the smallest quantity");
                System.out.println("5. Show Equipment Purchasing Report"); 
                System.out.println("6. Exit");
                int number = scan.nextInt();
                if(number==6){
                    System.out.println("The program is over, we look forward to your return.");
                }
                else{
                    System.out.println("No command like this! ");
                }
            }
        
    }

    public void register(){
        System.out.println("Enter a new login: ");
        String newLogin = scan.nextLine();
        if(newLogin==null || newLogin.isBlank()){
            throw new IllegalArgumentException("The new login cannot be null or blank");
        }else{
            newLogin=login;
            newLogin=getLogin();
            System.out.println("Enter a new password: ");
            String newPassword = scan.nextLine();
            if(newPassword==null || newPassword.isBlank()){
                throw new IllegalArgumentException("The new login cannot be null or blank");
            }else{
                newPassword=login;
                newPassword=getLogin();
                System.out.println("You have successfully registered.");
                login();
            }
        }
    }
}
