import java.util.*;;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column =sc. nextInt();
        for (int i=0; i < row ; i++ ) {
            for (int j =0;j <3 column ; j++ ) {
                System.out.print('*');
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }



/*

output:
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
 
*/
