// public class conditional {
//     public static void main (String args[]){
//         int age =19;
//         if(age>=18) {
//             System.out.println("adult: drive,vote");
//         }else{
//         if(age>13 && age<18) {
//             System.out.println("teenager");
//         } 
//         else {
//             System.out.println("not adult");
//            }
//         }
//      }
// }

    //largest of 2

// import java.util.Scanner;

// public class conditional {
//      public static void main (String args[]){
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();

//     if(a>=b){
//         System.out.println(a + " is the largest number");
//     }
//     else{
//         System.out.println(b + " is the largest number");
//     }
//      }
//     }

// print if odd or not
//  import java.util.Scanner;
//  public class conditional {
//       public static void main (String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();

//         if(a%2==0){
//             System.out.println("The number is even");
//         }else{
//             System.out.println("The number is odd");
//         }    
//         }
//       }
    
// else if
// import java.util.Scanner;
// public class conditional{
//     public static void main(String args[]){
//      Scanner sc=new Scanner(System.in);
//      int income=sc.nextInt();
//      float tax;
//      if(income<500000){
//         tax=0;
//      }
//     else if(income>=500000 && income< 1000000){
//         tax=income*(0.2f);
//     }
// else {
//     tax=income*(0.3f);
// }
// System.out.println(tax);
//     }

// }

//print largest of 3
// import java.util.Scanner;
// public class conditional{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a =sc.nextInt();
//         int b =sc.nextInt();
//         int c =sc.nextInt();

//     if(a>b && a>c){
//         System.out.println( a + "is the largest number");

//     }else if(b>c){
//         System.out.println( b + "is the largest number");
//     }
//     else{
//         System.out.println( c + "is the largest number");
//     }
//     }
// }
//Switch case

// import java.util.Scanner;

// public class conditional{
// public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//     switch(num){
//         case 1: System.out.println("samaso");
//                   break;
//         case 2: System.out.println("burger");
//                  break;
//         case 3: System.out.println("mango shake");
//                  break;
//         default :System.out.println("we wake up");      
//     }
//   }
// }
//Calculator
// import java.util.Scanner;
// public class conditional{
//     public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a:");
//        int a=sc.nextInt();
//        System.out.println("enter b:");
//        int b=sc.nextInt();
//        System.out.println("enter operater:");
//        char operator=sc.next().charAt(0);

//        switch(operator) {
//         case '+': System.out.println(a+b);
//                    break;
//         case '-': System.out.println(a-b);
//                    break;
//         case '*': System.out.println(a*b);
//                    break;
//         case '/': System.out.println(a/b);
//                    break;
//        } 
//     }
// }

//homework
// import java.util.Scanner;
// public class conditional{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the number");
//         int num=sc.nextInt();
//         if(num>0){
//             System.out.println(" number is possitive");
//         }
//         else{
//             System.out.println("the number is negative");
//         }

//         }
        
//     }
// public class conditional{
//     public static void main(String args[]){
//   double temp=103.5;
//   if(temp>100){
//     System.out.println("you have a fever");
//   }
//    else{
//     System.out.println("you don't have fever");
//    }
//     }
// }
//week number
// import java.util.Scanner;
// public class conditional{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
    
//         switch(num){
//             case 1: System.out.println("Sunday");
//             break;
//             case 2: System.out.println("Monday");
//             break;
//             case 3: System.out.println("Thusday");
//             break;
//             case 4: System.out.println("Wednesday");
//             break;
//             case 5: System.out.println("Thursday");
//             break;
//             case 6: System.out.println("Friday");
//             break;
//             case 7: System.out.println("Saturday");
//             break;
//             default:  System.out.println("wrong input");
//         }

//     }
// }
// 
// import java.util.Scanner;
//  public class conditional{
//      public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//          int a=sc.nextInt();

//          if(a%4==0){
//             System.out.println(" leap year");
//         }
//          else if(a%100==0){
//             System.out.println("not leap year");
//          }
//          else if(a%400==0){
//                 System.out.println(" leap year");
//             }
//             else {
//                 System.out.println(" not leap year");
//             }
//          }
//         }

        // import java.util.*;
        // public class conditional{
        // public static void main(String[]args) {
        //     Scanner sc=new Scanner(System.in);
        //     System.out.print("Input the year: ");
        //     int year=sc.nextInt();
        //     boolean x= (year%4) ==0;
        //     boolean y= (year%100) !=0;
        //     boolean z= ((year%100==0) && (year%400==0));
        //     if(x&& (y||z)) {
        //         System.out.println(year+" is a leap year");
        //     }else{
        //         System.out.println(year+" is not a leapyear");
        //     }}}