import java.util.*;;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
          int r = sc.nextInt();
            
        for (int i=1; i <= r ; i++ ) {
            for (int j=r; j>= i; j--) {
                System.out.print("*");

            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }

/*
Output
*****
****
***
**
*

*/

import java.util.*;;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
          int r = sc.nextInt();
            
        for (int i=1; i <= r ; i++ ) {
            for (int j=1; j <= r+1-i ; j++) {
                System.out.print(j);

            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }

/*
Output
1234
123
12
1


*/


import java.util.*;;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
          int r = sc.nextInt();
            
        for (int i=1; i <= r ; i++ ) {
            for (int j=1; j <= r+1-i ; j++) {
                System.out.print((char)(65 + (i - 1)));

            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }

/*
Output
AAAAA
BBBB
CCC
DD
E


*/
