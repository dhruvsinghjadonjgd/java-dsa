import java.util.*;;
public class practice {
    // print numbered square
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
          int r = sc.nextInt();
          int mid = r/2 + 1 ; 
        for (int i=1; i <= r ; i++ ) {
            for (int j = 1; j<=i; j++ ) {
                if (i%2 == 1){
                    if (j%2 ==1) {
                        System.out.print("1");
                    }
                    else{
                        System.out.print("0");
                    }
                    
                }else{
                    if (j%2 == 0) {
                        System.out.print("1");

                        
                    }else{
                        System.out.print("0");
                    }
                }
                

                
            }
            System.out.println(""); // Move to the next line after each row
        }

        }

    }


/*
Output

1
01
101
0101
10101

*/
