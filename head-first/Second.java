import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(num);

        if (num % 2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");

    }

}
