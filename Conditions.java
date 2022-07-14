import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int grade;
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your grade");
        grade = s.nextInt();
        if (grade >= 85){
            System.out.println("very good");
            System.out.println("Now your grade is " + (grade + 5));
        }


        if (grade <= 55){
            System.out.println("Very bad :(");
        }






//
//        if (grade % 2 == 0)
//            System.out.println("The number is Odd");


//        int number;
//
//        Scanner s = new Scanner(System.in);
//        System.out.println("Please enter number one");
//        number = s.nextInt();
//        System.out.println(number);
//
//        System.out.println("Process ended...");

    }
}
