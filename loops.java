// public class loops {
//     public static void main(String args[]){
//         int i=0;
//         while(i<10){
//             System.out.println("hello world ");
//             i++;
//         }
        
//     }
    
// }
// public class loops{
//     public static void main(String args[]){
//         int i=1;
//         while(i<=10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//     int n=sc.nextInt();
//     int i=0;
//     while(i<=n){
//         System.out.print( i +" ");
//         i++;
//     }
//     }
// }
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number");
//        int n=sc.nextInt();
//        int sum=0;
//        int i=1;
//        while(i<=n){
//         sum+=i;
//         i++;
//        }
//        System.out.println("sum is :"+ sum);
//     }
// }
//for loop
// import java.util.*;

// public class loops{
//     public static void main(String args[]){
//     for(int i=1; i<=10;i++){
//         System.out.println("Hello world");
//     }    
//     }
// }
// print square pattern
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             System.out.println("****");

//         }

//     }
// }
//print reverse of a number 
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//           int n=sc.nextInt();
//             while(n>0){
//         int lastDigit=n%10;
//         System.out.print(lastDigit);
//         n=n/10;
//         }
//     }   
// }
//do while
// public class loops{
//      public static void main(String args[]){
//         int counter =1;
//         do{
//             System.out.println("Hello World");
//             counter++;
//         }while(counter<=10);
//         }
//     }
// break statement
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         do{
//             int n=sc.nextInt();
//             if(n%10==0){
//                 break;
//             }
//             System.out.println(n);
//         }while(true);

//     }
// }
// import java.util.*;
//  public class loops{
//          public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
//       int n=sc.nextInt();
//     while(n%10==0){
//         System.out.println(n);
//         n++;
//     }
//     }
//  }
// continue to skip the iteration
// public class loops{
// public static void main(String args[]){
//     for( int i=0;i<=10;i++){
//         if(i==10){
//             continue;
//         }
//         System.out.println(i);
//     }
// }
// }

// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);  
//             do{
//                 int n=sc.nextInt();
//                 if(n%10==0){
//                 continue;
//             }
//             System.out.println("number was:"+n);
//         }while(true);
//     }
// }
// Check if the number is prime or not
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the value of n");
//         int n=sc.nextInt();

//          boolean isPrime=true;
//             for(int i=2;i<=Math.sqrt(n);i++){
//                 if(n%i==0){
//                     isPrime=false;
//                 }
//             }if(isPrime==true){
//                 System.out.println("is prime");
//             }else{
//                 System.out.println("not a prime");
//             }
//       }  }
// import java.util.*;
// public class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int number;
//         int choice;
//         int evenSum=0;
//         int oddSum=0;
//             do{
//                 System.out.print("Enter the number ");
//                 number=sc.nextInt();

//                 if(number%2==0){
//                     evenSum+=number;
//                 }else{
//                     oddSum+=number;
//                 }
                
//     System.out.print("Do u want to continue? Press 1 for yes or 0 for no");
//            choice=sc.nextInt();
//             }while(choice==1);
//             System.out.println("Sum of even numbers:"+evenSum);
//            System.out.println("Sum of odd numbers:"+oddSum); 
//         }
//     }