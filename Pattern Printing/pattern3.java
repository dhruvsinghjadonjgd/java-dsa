import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i=0; i < n ; i++ ) {
            for (int j =1;j < n + 1; j++ ) {
                System.out.print(j);
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }

// output
1234
1234
1234
1234
