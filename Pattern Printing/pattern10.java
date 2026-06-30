import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
          int r = sc.nextInt();
           
        for (int i=1; i <= r ; i++ ) {
            for (int j = 1; j<=r - i; j++ ) {
               System.out.print(" ");
            }
            for(int j = 1; j<= r; j++){
                System.out.print("x");
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }


/*
Output
     xxxxxx
    xxxxxx
   xxxxxx
  xxxxxx
 xxxxxx
xxxxxx


*/


import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
          int r = sc.nextInt();
           
        for (int i=1; i <= r ; i++ ) {
            for (int j = 1; j<=r - i; j++ ) {
               System.out.print(" ");
            }
            for(int j = 1; j<= 2*i - 1; j++){
                System.out.print("x");
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }


/*
Output
   x
  xxx
 xxxxx
xxxxxxx


*/



import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int nsp = r -1;
        int star = 1;
        for (int i=1; i <= r ; i++ ) {
            for (int j = 1; j<=nsp; j++ ) {
               System.out.print(" ");//for spaces
            }
            for(int j = 1; j<= i; j++){
                System.out.print(j);// numbers
            }
            for(int k = i-1; k>=1; k--){
                System.out.print(k);
            }
            System.out.println(""); // Move to the next line after each row
            nsp--;
            star+=2;
        }

        }

    }


/*
Output
    1
   121
  12321
 1234321
123454321


*/
