import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number in binary format: ");
        String num = in.nextLine();
        //Перевод из двоичной системы в десятичную
        int int_num = Integer.parseInt(num, 2);
        System.out.println("Your number in decimal format: " + int_num);
    }
}
