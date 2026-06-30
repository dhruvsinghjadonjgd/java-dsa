import java.util.*;;
public class practice {
    // print stars square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i=0; i < n ; i++ ) {
            for (int j =0;j < n ; j++ ) {
                System.out.print("* ");
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }

