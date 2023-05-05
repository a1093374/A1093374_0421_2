import java.util.Scanner;

public class A1093374_0421_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDate;
        String[] dateArray;
        int year, month, day;

        System.out.print("Please enter a date in the format of YYYY/MM/DD or MM/DD/YYYY: ");
        inputDate = scanner.nextLine();

        if (inputDate.matches("\\d{4}/\\d{2}/\\d{2}")) { // input format is YYYY/MM/DD
            dateArray = inputDate.split("/");
            year = Integer.parseInt(dateArray[0]);
            month = Integer.parseInt(dateArray[1]);
            day = Integer.parseInt(dateArray[2]);
        } else if (inputDate.matches("\\d{2}/\\d{2}/\\d{4}")) { // input format is MM/DD/YYYY
            dateArray = inputDate.split("/");
            year = Integer.parseInt(dateArray[2]);
            month = Integer.parseInt(dateArray[0]);
            day = Integer.parseInt(dateArray[1]);
        } else { // invalid input format
            System.out.println("ERROR!");
            return;
        }

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
