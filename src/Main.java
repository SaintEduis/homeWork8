import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Exercise 1
        int [] firstArray = new int [3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        double [] secondArray = {1.57, 7.654, 9.986};

        int [] thirdArray = new int [3];
        System.out.println("Введите по очереди три цифры: ");
        for (int i = 0; i < 3; i++) {
            int arrayNumb = in.nextInt();
            thirdArray[i] = arrayNumb;
        }
        System.out.println("---------------------");

        //Exercise 2
        for (int i = 0; i < 2; i++) {
            System.out.print(firstArray[i] + ", ");
        }
        System.out.println(firstArray[2]);

        for (int i = 0; i < 2; i++) {
            System.out.print(secondArray[i] + ", ");
        }
        System.out.println(secondArray[2]);

        for (int i = 0; i < 2; i++) {
            System.out.print(thirdArray[i] + ", ");
        }
        System.out.println(thirdArray[2]);
        System.out.println("---------------------");

        //Exercise 3
        for (int i = 2; i > 0; i--) {
            System.out.print(firstArray[i] + ", ");
        }
        System.out.println(firstArray[0]);

        for (int i = 2; i > 0; i--) {
            System.out.print(secondArray[i] + ", ");
        }
        System.out.println(secondArray[0]);

        for (int i = 2; i > 0; i--) {
            System.out.print(thirdArray[i] + ", ");
        }
        System.out.println(thirdArray[0]);
        System.out.println("---------------------");

        //Exercise 4
        for (int i = 0; i < 3; i++) {
            if ((i + 1) % 2 == 1) {
                firstArray[i] += 1;
            }
            System.out.print(firstArray[i] + " ");
        }
    }
}