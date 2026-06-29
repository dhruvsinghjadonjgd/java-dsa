import java.util.Scanner;
// // public class PrimeNumber {
// //     static boolean isPrime(int num){
// //             for (int i = 2; i < Math.sqrt(num)10; i++){
// //                 if (num % i == 0){
// //                     return false;
// //                 }
// //             }
// //             return true;
// //         }
// //     public static void main(String[] args) {
        
    
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a number: ");
// //         int n = sc.nextInt();
// //         int counter = 0;
// //         for (int i = 2; i <= n; i++){
// //             if (isPrime(i)){
// //                 counter++;
// //             }
// //         }
// //         System.out.println("Number of prime numbers less than " + n + " is: " + counter);
// //     }

// // }
// Class SieveOfEratosthenes {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         boolean[] isPrime = new boolean[n + 1];
//         Arrays.fill(isPrime, true);
//         isPrime[0] = false;
//         isPrime[1] = false;  
//         for (int i =2; i< n;i++){
//             if(isPrime[i]){
//                 for (int j = i * 2; j <= n; j += i){
//                     isPrime[j] = false;
//                 }
//             }
//         }
//         int counter = 0;
//         for (int i = 2; i < n; i++){
//             if (isPrime[i]){
//                 counter++;          
//             }
//         }
//         System.out.println("Number of prime numbers less than " + n + " is: " + counter);
//     }

// }
