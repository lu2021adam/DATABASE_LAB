// Adam, Cristian, and JP
// WHRTLUHC

import java.util.*;

public class DataBase{

    public static void newAccount(String userName, Integer startBalance, Integer index, String [] userNames, Integer [] userBalances){
        userNames[index] = userName;
        userBalances[index] = startBalance;
        System.out.println("New account created for " + userName + " with starting balance of $" + startBalance);
    }

    public static void lookupAccount(String accountName, String [] userNames, Integer [] userBalances){
        for(int i = 0; i < userNames.length; i++){
            if(userNames[i].equals(accountName)){
                System.out.println(userBalances[i]);
            } else {
                System.out.println("No account exists for this user, please create an account to view a balance for this user name.");
            }
        }
    }

    public static String userWelcome(String [] userNames, Integer [] userBalances){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Please choose an option: [n]ew account, [d]isplay balance, [q]uit:");
        String userAction = userInput.nextLine();
        if(userAction.equals("n")){
            System.out.println("Please enter a user name for the account: ");
            String userName = userInput.nextLine();
            System.out.println("Please enter a starting balance for the account: ");
            Integer startBalance = userInput.nextInt();
            Integer index = 0;
            newAccount(userName, startBalance, index, userNames, userBalances);
            index++;
        } else if(userAction.equals("d")){
            System.out.println("Please enter a name to see the balance: "); 
            String accountName = userInput.nextLine();
            lookupAccount(accountName, userNames, userBalances);
        } else if(userAction.equals("q")){
            return "End of the program";
        } else {
            System.out.println("Please enter a valid letter (n, d, or q)");
        }
        return "End of the program";
    }


    public static void main(String [] args){
        String [] userNames = new String[300];
        Integer [] userBalances = new Integer[300];
        while(true){ 
        String returnValue = userWelcome(userNames, userBalances);
        if(returnValue == "End of the program"){
            System.out.println("End of the program");
            break;
        } 
        }
    }
}