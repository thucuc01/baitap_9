import java.util.Scanner;

public class Test {
    static int sideA, sideB, sideC;
    static boolean check = false;
    static boolean check2=false;
    static void isTriangle()  throws IllegalTriangleException {
        if (!(sideA+sideB<=sideC && sideA+sideC<=sideB && sideB+sideC<=sideA)) {
            check2=true;
            throw new IllegalTriangleException("this is not triangle");
        } else if (sideA<0||sideB<0||sideC<0) {
            check2=true;
            throw new IllegalTriangleException("Side must great than 0");
        }
    }
    static void enter() {
        check2=false;
        check = false;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter side A");
            sideA = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter side B");
            sideB = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter side C");
            sideC = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            check = true;
            System.err.println("Moi nhap lai cho dung :");
//                e.printStackTrace();
            enter();
        }
    }
    public static void main(String[] args) {
        try {
            do {
                enter();
                isTriangle();
            } while (check);
        } catch (IllegalTriangleException T) {
            System.out.println("Exception occured! " + T);
            do {
                enter();
            } while (check2);
            T.printStackTrace();
        }
//        System.out.println("this is triangle");
    }
}