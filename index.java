//  Write a Java program to input and display your password.
import java.io.Console;   

public class index{


    public static void main (String args[]) throws Exception {
        //  logic to check if console is present 
        Console console = System.console();
        if(console == null)
        {
            System.out.println("Unable to fetch console");
            return;
        }
        // for terminal or shell or bash
        System.out.print("Enter Username:  ");
        String userName = console.readLine();

        System.out.print("Enter Password:  ");
        char ch[] = console.readPassword();
        String password = String.valueOf(ch);


        System.out.println("Username entered is: " + userName);
        System.out.println("Password entered is: " + password);
    }
}

// method 2 
// import java.io.Console;
// public class index {
// 	public static void main(String[] args) {
// 		Console cons;
// 		if ((cons = System.console()) != null) {
// 			char[] pass_ward = null;
// 			try {
// 				pass_ward = cons.readPassword("Input your Password:");
// 				System.out.println("Your password was: " + new String(pass_ward));
// 			} finally {
// 				if (pass_ward != null) {
// 					java.util.Arrays.fill(pass_ward, ' ');
// 				}
// 			}
// 		} else {
// 			throw new RuntimeException("Can't get password...No console");
// 		}
// 	}
// }
