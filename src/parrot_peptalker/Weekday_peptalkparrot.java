package parrot_peptalker;

import java.util.Scanner;

public class Weekday_peptalkparrot {
    private String Monday = "Get ready to regain your focus and push for your goals";
    private String Tuesday = "You are going to be productive since your tasks at work will be done";
    private String Wednesday = "A smile will be put on your face as you slide down towards the weekend";
    private String Thursday = "Your week is about to turn around and make you happy";
    private String Friday = "Time to reflect of what you have done throughout the week";

    /*
    * Program name: -> Weekday pep talk parrot
    * Program description: -> The objective of this program is to get users to have a good start
    * of the week by understanding the meaning of each day in the week
    * */

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        Weekday_peptalkparrot user = new Weekday_peptalkparrot();
        System.out.println("Please enter a day of the week(Monday, Tuesday, Wednesday, Thursday, Friday)");
        String user_response = object.nextLine();

        switch (user_response){
            case ("Monday"):
                System.out.println(user.Monday);
                break;
            case ("Tuesday"):
                System.out.println(user.Tuesday);
                break;
            case ("Wednesday"):
                System.out.println(user.Wednesday);
                break;
            case ("Thursday"):
                System.out.println(user.Thursday);
                break;
            case ("Friday"):
                System.out.println(user.Friday);
                break;
            default:
                System.out.println("Sorry, you have entered an incorrect weekday!");
        }
    }
}
