package task21;

import java.util.ArrayList;
import java.util.Scanner;

public class Task21 {

    // Write a program that take from user number consist of many digits and then get count of every number between 1 – 9
    public static void main(String[] args) {
        System.out.print("please enter a number: ");
        Scanner t = new Scanner(System.in);
        long num = t.nextLong();
        int nums [] = new int [9];
        int empty=0, full=0, count=0;
        for (int i = 0; i<9; i++){
            int dig = (int) (num % 10);
            nums[i] = dig;
            num = num/10;
        }
 
        for (int i = 0; i<9; i++){
            if(nums[i] == 0)
                empty = empty + 1;
        }
        full = 9-empty;
        
        for (int i = 0; i<full; i++){
            count = i+1;
            System.out.println( count + " .... > " + nums[i]);
        }
       

    }
    
}
