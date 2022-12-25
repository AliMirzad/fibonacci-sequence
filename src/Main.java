import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    *
    * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    *
    * */
        Scanner input = new Scanner(System.in);
        System.out.print("input number: ");
        int number = input.nextInt();
        if (number <= 1) System.out.println(1);
        else {
            int x = 0;
            int y = 1;
            int z = 0;
            System.out.print(1 + ", ");
            for (int i = 0; i < number; i++) {
                z = x + y;
                x = y;
                y = z;
                System.out.print(z + ", ");
            }
        }
    }
}
