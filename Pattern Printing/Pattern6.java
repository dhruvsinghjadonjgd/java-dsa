import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
          int r = sc.nextInt();
            
        for (int i=1; i <= r ; i++ ) {
            for (int j = 1;j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }

/*
Output
*
**
***
****
*****

*/

import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
          int r = sc.nextInt();
            
        for (int i=1; i <= r ; i++ ) {
            for (int j = 1;j <= i; j++ ) {
                System.out.print(j);
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }

/*
Output
1
12
123
1234
12345

*/


import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
          int r = sc.nextInt();
            
        for (int i=1; i <= r ; i++ ) {
            for (int j = 1;j <= i; j++ ) {
                System.out.print(i);
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }

/*
Output
1
22
333
4444

*/

import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
          int r = sc.nextInt();
            
        for (int i=1; i <= r ; i++ ) {
            for (int j = 1;j <= i; j++ ) {
                System.out.print((char)((j-1) + 97));
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }

/*
Output
a
ab
abc
abcd
abcde

*/
