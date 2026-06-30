import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i=1; i < n+1 ; i++ ) {
            for (int j =0;j < n; j++ ) {
                System.out.print((char)(j +65));
                // System.out.print((char)(j +97)); for smaller letter
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }

output:
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
