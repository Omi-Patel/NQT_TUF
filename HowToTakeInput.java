// Taking input while you don't know the length

import java.util.Arrays;
import java.util.Scanner;

class HowToTakeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // while (sc.hasNext()) {
        //     int n = sc.nextInt();
        //     String s = sc.next();
        //     System.out.println(n + " " + s);
        // }

        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println("Input : " + s);

            String arr[] = s.split(" ,");
            System.out.println(Arrays.toString(arr));
        }

        sc.close();
    }
}