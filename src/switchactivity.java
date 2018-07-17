import java.util.Scanner;

public class switchactivity {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Give me the item number ill go retrieve it for you: ");
        String code = keyboard.next();

        //String list = code;
        String item = ""; //= code;

        switch (code) {
            case "BALL":
                item = "Golf Balls (1 dozen)\t $38.00";
                break;

            case "DRV01":
                item = "Big Bertha Driver\t $449.95";
                break;

            case "DRV02":
                item = "Vaporizer Driver\t $375.00";
                break;

            case "DRV03":
                item = "Fly-Z Driver\t $179.00";
                break;

            case "SET01":
                item = "Project Manager Gold Club Set\t $179.00";
                break;

            case "SET02":
                item = "Junior VP Golf Club Set\t $225.00";
                break;

            case "SET03":
                item = "Executive Golf Club Set\t $299.95";
                break;

            case "SET04":
                item = "CEO Golf Club Set\t $374.95";
                break;

            case "SET05":
                item = "Chairman of the Board Club Set \t$495.00";
                break;
            default:
                item ="Item cannot be found...";


        }
        System.out.println(item);











       /*String month = "k";
       String monthName;
       switch (month) {
           case "a":  monthName = "January";
               break;
           case "b":  monthName = "February";
               break;
           case "c":  monthName = "March";
               break;
           case "d":  monthName = "April";
               break;
           case "e":  monthName = "May";
               break;
           case "f":  monthName = "June";
               break;
           case "g":  monthName = "July";
               break;
           case "h":  monthName = "August";
               break;
           case "i":  monthName = "September";
               break;
           case "j": monthName = "October";
               break;
           case "k": monthName = "November";
               break;
           case "l": monthName = "December";
               break;
           default: monthName = "Unknown";
               break;
       }
       System.out.println(monthName);
*/


    }


}
