package task21;

import java.util.ArrayList;
import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {
        System.out.print("please enter a number: ");
        Scanner t = new Scanner(System.in);
        long num = t.nextLong();
        ArrayList<Integer> nums = new ArrayList<>();
        int dig;
        for (int i = 0; i < 9; i++) {
            dig = (int) (num % 10);
            nums.add(dig);
            num = num / 10;
        }
        int size = nums.size(), count = 1;
        for (int i = 0; i < size; i++) {
            count = count + 1;
            System.out.println(count + " .... > " + nums.get(i));
        }

    }

}
