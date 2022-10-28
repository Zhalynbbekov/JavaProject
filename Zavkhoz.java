import java.util.Scanner;
public class Zavkhoz {
    Scanner scan = new Scanner(System.in);
    String login;
    String password;
    public Zavkhoz(String login, String password){
        this.login = login;
        this.password = password;
    }

    public Zavkhoz(Zavkhoz source){
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
            System.out.println("Hello, dear Zavkhoz!");
            System.out.println("Enter a number to work: ");
            System.out.println("1. Show all list of school equipment");
            System.out.println("2. Search equipment: \n 1.By serial number \n Write the serial number to search:>>(After that, a list of equipment by serial number is displayed)\n 2.By name \n Write the name of the equipment to search:>> (After that, a list of equipment is displayed)");
            System.out.println("3. Show equipment report (Shows the entire list of equipment that is available with the quantity and year it was purchased)");
            System.out.println("4. Order equipment: \n Please write what equipment you would like to order: \n(Here the name of the equipment to be ordered is indicated, after which this specified name of the equipment is recorded in a separate file “Ordered equipment”)");
            System.out.println("5. View the list of ordered equipment (Shows the entire list of ordered equipment from the file “Ordered equipment”)"); 
            System.out.println("6. Delete order:");
            System.out.println("7. Exit");
            int number = scan.nextInt();
            if(number==6){
                System.out.println("What equipment would you like to remove? >>> (Removes equipment from the 'Ordered Equipment' file)");
            }
            else if(number==7){
                System.out.println("The program is over, we look forward to your return.");
            }
            else{
                System.out.println("No command like this! ");
            }
        }
    
    }
}
