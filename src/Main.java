import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yılı Giriniz: ");
        short year = input.nextShort();

        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " yılı bir artık yıldır.");
        } else if (year % 4 == 0 && !(year%100==0)) {
            System.out.println(year + " yılı bir artık yıldır.");
        } else {
            System.out.println(year + " yılı artık bir yıl değildir.");
        }

    }
}
