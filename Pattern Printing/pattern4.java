import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i=1; i < n+1 ; i++ ) {
            for (int j =1;j < n + 1; j++ ) {
                System.out.print(i);
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }
output:
1111
2222
3333
4444
