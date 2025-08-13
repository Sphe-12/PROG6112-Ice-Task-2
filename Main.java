import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" HOME MAKEOVER REPORT");
        System.out.println("-------------------------------------");

        //declare and enter everything that is to be displayed
        String[] Months = {"Jan", "Feb", "March", "April", "May", "June"};
        String[] rooms = {"Bathroom", "Kitchen", "Garden"};
        int[][] numbers = {{8, 2, 5}, {7, 4, 5}, {5, 5, 2}, {2, 2, 3}, {7, 7, 9}, {7, 8, 5}};


        System.out.printf("%-10s", "Months");
        for (String room : rooms) {
            System.out.printf("%-10s", room);
        }
        System.out.println();


        for (int i = 0; i < Months.length; i++) {
            System.out.printf("%-10s", Months[i]);
            for (int j = 0; j < rooms.length; j++) {
                System.out.printf("%-10d", numbers[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
        System.out.println("MONTHLY TOTALS");

        for (int i = 0; i < Months.length; i++) {
            int total = numbers[i][0] + numbers[i][1] + numbers[i][2];
            System.out.printf("\n" + "%-10s%-5s", Months[i], total);
            if (total >= 15) {
                System.out.printf("%-5s", "*");
            }

        }


    }
}