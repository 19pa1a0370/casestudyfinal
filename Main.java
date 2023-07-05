/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("select a number to proceed\n1-login\n2-register");
		int choice1 = sc.nextInt();
		System.out.println();
		if (choice1 == 1){
		    if(check()){
		        System.out.println("loading page");
		        options();
		    }
		}
		else{
		    registration();
		}
	}
	
	static boolean check()
	{
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter loginID:");
		        int loginID = sc.nextInt();sc.nextLine();
		        System.out.println("Enter password:");
		        String password = sc.nextLine();
		        System.out.println();
		        String logid = String.valueOf(loginID);
		        //We have to stroe the given passowrd and check wether the 
		        //given password matches with the password in the table
		        //Statement s = con.CreateStatement();
		        //String pwrd = "select password from passengerDetails where passengerID = loginID";
		        //ResultSet x = s.executeQuery(pwrd);
		        //while(x.next()){
		          //  int real_pwrd = x.get()
		        // }
		        if (logid.length() != 7){
		            return check();
		        }
		        else{
		            return true;
		        }
    }
    
    static void registration(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your email:");
        String email = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        System.out.println("Enter your address:");
        String address = sc.nextLine();
        System.out.println();
        // 7-digit random number generation 
        Random rand = new Random(); 
        int passengerID = rand.nextInt(9000000) + 1000000;
        //enter this into data base inside the passenger table
        //Statement s1 = con.CreateStatement();
        // String query = "insert into passengerDetails values(passengerID,.........)";
        // query.executeUpdate(query);
        if(check()){
            options();
        }
    }
    
    static void options(){
        System.out.println("please select a number:\n1-Book ticket\n2-View ticket\n3-Update details\n4-Logout");
        Scanner sc = new Scanner(System.in);
        int choice2 = sc.nextInt();
        if(choice2 == 1){
            System.out.println("Enter your source location");
            String Source = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter your destination location");
            String Destination = sc.nextLine();
            System.out.println("Enter your Date of travel");
            String dateOfTravel = sc.nextLine();
            System.out.println("Enter your seat preference");
            String seatPreference = sc.nextLine();
            System.out.println("Enter your meal preference");
            String mealPreference = sc.nextLine();
            System.out.println();
            System.out.println("Booking Successful");
            //print the query
        }
        else if(choice2 == 2){
            System.out.println("Passenger ticket details");
            //print query
            
        }
        else if(choice2 == 3){
            
            //delete using query
            System.out.println("Ticket deleted successfully");
        }
        else{
            System.out.println("Your session is logged out successfully");
        }
    }
}
