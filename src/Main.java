import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
//      pattern1(n);
//      pattern2(n);
//      pattern3(n);
//      pattern4(n);
//      pattern5(n);
//      pattern6(n);
//      pattern7(n);
//      pattern8(n);
//      pattern8(n);
//      pattern9(n);
//      pattern10(n);
//      pattern11(n);
//      pattern12(n);
//      pattern13(n);
//      pattern14(n);
//      pattern15("hello",n);
//        pattern16(n);
        pattern17(n);
    }

    static void pattern1(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int total = row > n ? 2 * n - row : row;
            for (int col = 0; col < total; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = n; col >= n - row + 1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int toatal = row > n ? 2 * n - row : row;
            int gap = n - toatal;
            for (int k = 1; k <= gap; k++) {
                System.out.print(" ");

            }
            for (int col = 1; col <= toatal; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = row; col <= n; col++) {
                System.out.print(" " + col);
            }
            for (int col = 1; col < row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("" + col);
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            for (int k = row; k <= n; k++) {
                System.out.print(" ");
            }
            for (int col = n; col > n - row; col--) {
                System.out.print("" + col);
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int k = row; k <= n; k++) {
                System.out.print(" ");
            }
            for (int col = n - row + 1; col <= n; col++) {
                System.out.print("" + col);
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        int count = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                count = count + 1;
                System.out.print(" " + count);
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            for (int k = 1; k <= n - row; k++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                if (col == 1 || row == n / 2 + 2 || col == row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row <= n * 2; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row == 1) || (col == 1) || (row == n || row == n * 2) || col == n) {
                    if((row==1||row==n*2||row==n) &&(col==n)){
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        int count=1;
        for (int row = 1; row <= n; row++) {
            if (row % 2 != 0) {
                for (int col = 1; col <= n; col++) {
                    System.out.print(" " + count);
                    count++;
                }
            }
            else {
                for (int col = 1; col <= n; col++) {
                    System.out.print(" " + (count + n - col));
                }
                count += n;
            }
            System.out.println();
        }
    }

    static void pattern14(int n){
        int oddCount=1;
        int evenCount=2;
        for(int row=1;row<=n;row++){
            if(row%2==0){
                for(int col=1;col<=n;col++){
                    System.out.print(" "+evenCount);
                    evenCount+=2;
                }
                System.out.println();
            }
            else{
                for(int col=1;col<=n;col++){
                    System.out.print(" "+oddCount);
                    oddCount+=2;
                }
                System.out.println();
            }
        }
    }

    static void pattern15(String str,int n){

        for(int row=0;row<=str.length();row++){
            for(int col=0;col<row;col++){
                System.out.print(""+str.charAt(col));
            }
            System.out.println();
        }
    }

    static void pattern16(int n){
        for(int row=1;row<=n;row++){
            for (int k = row; k <= n; k++) {
                System.out.print(" ");
            }
            for (int col = 1; col<=row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int total = row > n ? 2 * n - row : row;
            int gap = n - total;
            for (int k = 1; k <= gap; k++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= total; col++) {
                System.out.print(" "+col);
            }
            for(int i=1;i<total;i++){
                System.out.print(" "+(total-i));
            }
            System.out.println();
        }
    }
}

