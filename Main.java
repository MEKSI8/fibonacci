import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int say = input.nextInt();

        int a=0;
        int b=1;

        System.out.println(0);
        for (int i = 0; i <say-1 ; i++) {
            int c=a+b;

            System.out.println(a+" + "+b+" = "+c);
            a=b;
            b=c;



        }

    }
}