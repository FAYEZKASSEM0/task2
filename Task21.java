package task21;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {
        System.out.print("please enter a number: ");
        Scanner t = new Scanner(System.in);
        String num = t.nextLine();
        int nums [] = new int[10];
        String strarr[] = num.split("");
        for (String strarr1 : strarr) {
            nums[Integer.parseInt(strarr1)] = nums[Integer.parseInt(strarr1)] + 1;
        }
        for (int i = 0; i < 10; i++) 
            System.out.println(i + " .... > " + nums[i]);
        }
}
