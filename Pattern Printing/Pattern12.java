import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int nsp = r -1;
        int star = 1;
        for(int j = 1; j<=2*r-1 ; j++){
                System.out.print("*" + " ");
        }// spaces
        System.out.println("");
        r-=1;
        for (int i=1; i <= r ; i++ ) {
            for (int j = 1; j<=r-i+1; j++ ) {
               System.out.print("* ");//for 1st part
            }
            for(int j = 1; j<= 2*i-1; j++){
                System.out.print("  ");// spaces
            }
            for (int j = 1; j<=r-i+1; j++ ) {
               System.out.print("* ");//for 1st part
            }
            System.out.println(""); // Move to the next line after each row
            nsp--;
            star+=2;
        }

        }

    }


/*
Output
* * * * * * * * * * * 
* * * * *   * * * * * 
* * * *       * * * * 
* * *           * * * 
* *               * * 
*                   * 


*/
