import java.util.*;

import java.util.Scanner;

public class Exp01COOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bits you want");
        int n=sc.nextInt();
        System.out.println("Enter the binary number bit by bit");
        int BN[]= new int[n];
        // Input arry loop
        for(int i=0;i<n;i++)
        {
            BN[i]=sc.nextInt(); 
        }
        System.out.println("Your number is:");
        // Print the number loop
        for(int i=0;i<n;i++)
        {
            System.out.print(BN[i]);
        
        }
        System.out.print("\n");
        int OnesComp[]=new int [n];
        for(int i=0;i<n;i++)
        {
            if(BN[i]==0){
                OnesComp[i]=1;
            }
            if(BN[i]==1){
                OnesComp[i]=0;
            }
        
        }
        System.out.println("The ones compliment is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(OnesComp[i]);
        
        }
        int TwoComp[]= new int[n+1];
        int carry=1;
        for(int i=n-1;i>=0;i--)
        {
            if(OnesComp[i]==1 && carry==1){
                TwoComp[i+1]=0;
            }
            if(OnesComp[i]==0 && carry==1){
                TwoComp[i+1]=1;
                carry=0;
            }
            if(OnesComp[i]==1 && carry==0){
                TwoComp[i+1]=1;
            }
            if(i==0 && carry==0){
                TwoComp[0]=0;
            }
            else{
                TwoComp[0]=1;
            }
        
        }
        System.out.println("\nThe twos complement is:");
        for(int i=0;i<n+1;i++)
        {
            System.out.print(TwoComp[i]);
        }

        

    }
}

public class Exp07 {
    static Scanner sc = new Scanner(System.in);

    public static int[] inputbinary(int size) {
        int BN[] = new int[size];
        for (int i = 0; i < size; i++) {
            BN[i] = sc.nextInt();
            if (BN[i] != 0 && BN[i] != 1) {
                System.out.println("Invalid input. Please enter 0 or 1.");
                System.exit(0);
            }
        }
        return BN;
    }

    public static void printbinary(int[] BN) {
        for (int i = 0; i < BN.length; i++) {
            System.out.print(BN[i]);
        }
    }

    public static int BtoD(int BN[]) {
        int len = BN.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            result += BN[len - i - 1] * Math.pow(2, i);
        }
        return result;
    }

    public static int[] DtoB(int num) {
        int rem[] = new int[100];
        int i = 0;
        while (num > 0) {
            rem[i] = num % 2;
            num = num / 2;
            i++;
        }
        int result[] = new int[i + 1];
        for (int j = 0; j < i; j++) {
            result[j] = rem[i - j];
        }
        return result;

    }

    public static int[] addbinary(int BN1[], int BN2[]) {
        int num1 = BtoD(BN1);
        int num2 = BtoD(BN2);
        int sum = num1 + num2;
        int result[] = DtoB(sum);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of bits");
        int n = sc.nextInt();
        System.out.println("Enter the binary number bit by bit");
        int BN1[] = inputbinary(n);
        System.out.print("The number is:");
        printbinary(BN1);

        System.out.println("Enter the binary number bit by bit");
        int BN2[] = inputbinary(n);
        System.out.print("The number is:");
        printbinary(BN2);

        System.out.println("");
        int sum[] = addbinary(BN1, BN2);
        System.out.print("The sum of binary is:");
        printbinary(sum);

    }
}

import java.util.*;

public class Exp07_2 {
    static Scanner sc = new Scanner(System.in);

    public static int[] inputOctal(int size) {
        int OCN[] = new int[size];
        for (int i = 0; i < size; i++) {
            OCN[i] = sc.nextInt();
            if (OCN[i] < 0 || OCN[i] > 7) {
                System.out.println("Invalid input. Please enter number 0 to 7");
                System.exit(0);
            }
        }
        return OCN;
    }

    public static void printOctal(int[] OCN) {
        for (int i = 0; i < OCN.length; i++) {
            System.out.print(OCN[i]);
        }
    }

    public static int OCtoD(int OCN[]) {
        int len = OCN.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            result += OCN[len - i - 1] * Math.pow(8, i);
        }
        return result;
    }

    public static int[] DtoOC(int num) {
        int rem[] = new int[100];
        int i = 0;
        while (num > 0) {
            rem[i] = num % 8;
            num = num / 8;
            i++;
        }
        int result[] = new int[i];
        for (int j = 0; j < i; j++) {
            result[j] = rem[i - j - 1];
        }
        return result;

    }

    public static int[] addbinary(int OCN1[], int OCN2[]) {
        int num1 = OCtoD(OCN1);
        int num2 = OCtoD(OCN2);
        int sum = num1 + num2;
        int result[] = DtoOC(sum);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of digits");
        int n = sc.nextInt();
        System.out.println("Enter the OCtal number bit by bit");
        int OCN1[] = inputOctal(n);
        System.out.print("The number is:");
        printOctal(OCN1);

        System.out.println("Enter the binary number bit by bit");
        int OCN2[] = inputOctal(n);
        System.out.print("The number is:");
        printOctal(OCN2);

        System.out.println("");
        int sum[] = addbinary(OCN1, OCN2);
        System.out.print("The sum of binary is:");
        printOctal(sum);

    }
}
