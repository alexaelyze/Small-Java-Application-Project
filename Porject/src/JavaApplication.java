import java.util.Scanner;

public class JavaApplication {

    public static void main(String[] args) {
        displayMenu();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter your choice: ");
                String choice = scanner.nextLine();
                if (handleOption(choice)) {
                    break;
                }
            }
        }
    }

    public static void displayMenu() {
        System.out.println("Choose an option:");
        System.out.println("[1] Option 1: Basketball Team Application");
        System.out.println("[2] Option 2: Product Details");
        System.out.println("[3] Exit");
    }

    public static boolean handleOption(String option) {
        switch (option) {
            case "1":
                System.out.println("Option 1 chosen: Basketball Team Application");
                // Add the logic for the basketball team application here
                break;
            case "2":
                System.out.println("Option 2 chosen: Product Details\n");
	   Date1 d1 = new Date1("December", 25, 2020);
		Product p1 = new Product("Chicken", "CH1", d1);
		
	    Date1 d2 = new Date1("September", 18, 2017);
		Product p2 = new Product("Bread", "BR1", d2);
		
		Date1 d3 = new Date1("March", 25, 2015);
		Product p3 = new Product("Canned Peaches", "CP1", d3);
		
                Date1 d4 = new Date1("April", 5, 2021);
		Product p4 = new Product("Pasta", "PS1", d4);
                
                Date1 d5 = new Date1("June", 13, 2023);
		Product p5 = new Product("Chocolate", "CH2", d5);
                
		System.out.printf("%-20s%-20s%-28s%-10s\n","Product Name", "Product Code", "Manufacturing Date", "Condition");
		System.out.println("-------------------------------------------------------------------------------");
		
		
		System.out.printf("%-20s%-20s%-1s, %-1d %-15d", p1.GetName(), p1.GetCode(), p1.manDate.GetMonth(),p1.manDate.GetDay(),p1.manDate.GetYear());
        if(p1.CheckDate())
		    System.out.println("good");
	    else
	        System.out.println("expired");
	    
	    System.out.printf("%-20s%-20s%-1s, %-1d %-14d", p2.GetName(), p2.GetCode(), p2.manDate.GetMonth(),p2.manDate.GetDay(),p2.manDate.GetYear());
        if(p2.CheckDate())
		    System.out.println("good");
	    else
	        System.out.println("expired");
	    
	    System.out.printf("%-20s%-20s%-1s, %-1d %-19d", p3.GetName(), p3.GetCode(), p3.manDate.GetMonth(),p3.manDate.GetDay(),p3.manDate.GetYear());
        if(p3.CheckDate())
		    System.out.println("good");
	    else
	        System.out.println("expired");
        
        System.out.printf("%-20s%-20s%-1s, %-1d %-19d", p4.GetName(), p4.GetCode(), p4.manDate.GetMonth(),p4.manDate.GetDay(),p4.manDate.GetYear());
        if(p4.CheckDate())
		    System.out.println("good");
	    else
	        System.out.println("expired");
        
        System.out.printf("%-20s%-20s%-1s, %-1d %-19d", p5.GetName(), p5.GetCode(), p5.manDate.GetMonth(),p5.manDate.GetDay(),p5.manDate.GetYear());
        if(p5.CheckDate())
		    System.out.println("good");
	    else
	        System.out.println("expired");
	
               break;
               
            case "3":
                System.out.println("Exiting... Thank you for using this program. Have a nice day!");
                return true;
            default:
                System.out.println("Invalid option. Please choose again.");
        }
        return false;
    }
}