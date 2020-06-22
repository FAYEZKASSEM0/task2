package task22;

import java.util.Scanner;

public class Task22 {

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                count = count + 1;
                System.out.print("enter the value of [" + i + "][" + j + "]: ");
                Scanner t = new Scanner(System.in);
                int temp = t.nextInt();
                arr[i][j] = temp;
            }
        }
        int refc, equalc = 0, plus = 0, refr, equalr = 0, refd1, equald1 = 0, equald2 = 0;
        for (int i = 0; i < 3; i++) {
            refr = arr[i][0];
            refc = arr[0][i];
            refd1 = arr[1][1];
            for (int j = 1; j < 3; j++) {
                plus = i + 1;
            
                if (arr[i][j] == refr) 
                    equalr = equalr + refr;
                
                if (arr[j][i] == refc) 
                    equalc = equalc + refc;
            }
            
            if (arr[i][2 - i] == refd1) 
                equald2 = equald2 + refd1;
            
            if (equald2 == refd1 * 3)
                System.out.println("diagonal 2 is equal");
            
            if (equalr == refr * 2) 
                System.out.println("row " + plus + " is equal");
            
            if (equalc == refc * 2) 
                System.out.println("column " + plus + " is equal");
            
            if (arr[i][i] == refd1) 
                equald1 = equald1 + refd1;
            
            if (equald1 == refd1 * 3) 
                System.out.println("diagonal 1 is equal");
        }
    }
}
