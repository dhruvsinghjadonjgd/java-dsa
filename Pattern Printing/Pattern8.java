import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
          int r = sc.nextInt();
          int mid = r/2 + 1 ; 
        for (int i=1; i <= r ; i++ ) {
            for (int j = 1; j<=r; j++ ) {
                if (i == j || i + j == r +1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }


/*
Output
*   *
 * * 
  *  
 * * 
*   *
*/
