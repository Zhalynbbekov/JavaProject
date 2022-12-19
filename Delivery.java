import java.util.Scanner;
public class Delivery {
    Scanner scan = new Scanner(System.in);
    private String login;
    private String password;
    public Delivery(String login, String password){
        this.login = login;
        this.password = password;
    }

    public Delivery(Delivery source){
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
            System.out.println("Hello, dear Delivery!");
            System.out.println("Enter a number to work: ");
            System.out.println("1. Show a list of delivery equipment (Shows a list of delivery equipment from the 'Ordered Equipment' file)");
            System.out.println("2. Show delivered equipment (Shows a list of delivered equipment from the 'Delivered equipment' file)");
            System.out.println("3. Deliver the equipment: \nWhat equipment was delivered? Enter the name of the equipment or its serial number \n(The file contains the name or serial number of the equipment that was written by the deliverer and at the same time the record of this equipment is removed from the file 'Ordered equipment' ");
            System.out.println("4. Show the number of delivered equipment: \n(Shows the number of delivered equipment from the 'Delivered Equipment' file)");
            System.out.println("5. Show the number of equipment ordered (Shows the number of equipment to be delivered from 'Ordered equipment')"); 
            System.out.println("6. Show my earnings (Shows how much he received for each equipment from the 'Delivered Equipment' file, the rate for delivery can be set for your consideration)");
            System.out.println("7. Exit");
            int number = scan.nextInt();
            if(number==7){
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
