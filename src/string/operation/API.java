package string.operation;

import java.util.Scanner;

public class API {
    public static void main(String[] args) {
        System.out.println("Please enter ten numbers:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        int num7 = sc.nextInt();
        int num8 = sc.nextInt();
        int num9 = sc.nextInt();
        int num10 = sc.nextInt();

        int total = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9+ num10 ;
        System.out.println("Addition of three numbers;"+ num1+" "+ num2 + " "+num3+" "+num4+" "+num5+" "+num6+" "+" "+num7+" "+num8 + " "+num9+" "+num10+" is "+ total);
        sc.close();
    }

}

