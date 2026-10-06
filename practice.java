// public class practice {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;

//         int sum = a + b;

//         System.out.println("Sum = " + sum);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         int num = 15;

//         if (num % 2 == 0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }
//     }
// }
// public class practice {
//     public static void main(String[] args) {
//         int a = 25;
//         int b = 40;
//         int c = 30;

//         if (a > b && a > c) {
//             System.out.println(a + " is largest");
//         } else if (b > a && b > c) {
//             System.out.println(b + " is largest");
//         } else {
//             System.out.println(c + " is largest");
//         }
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         int n = 5;
//         int sum = 0;

//         for (int i = 1; i <= n; i++) {
//             sum = sum + i;
//         }

//         System.out.println("Sum = " + sum);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(n + " x " + i + " = " + (n * i));
//         }
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         int n = 5;
//         int fact = 1;

//         for (int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }

//         System.out.println("Factorial = " + fact);
//     }
// }

//

// public class practice {
//     public static void main(String[] args) {
//         int num = 1234;
//         int sum = 0;

//         while (num > 0) {
//             int digit = num % 10;
//             sum = sum + digit;
//             num = num / 10;
//         }

//         System.out.println("Sum = " + sum);
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         int num = 121;
//         int original = num;
//         int reverse = 0;

//         while (num > 0) {
//             int digit = num % 10;
//             reverse = reverse * 10 + digit;
//             num = num / 10;
//         }

//         if (original == reverse) {
//             System.out.println("Palindrome");
//         } else {
//             System.out.println("Not Palindrome");
//         }
//     }
// }

// public class practice {
//     public static void main(String[] args) {
//         int[] arr = {10, 50, 20, 80, 30};

//         int largest = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > largest) {
//                 largest = arr[i];
//             }
//         }

//         System.out.println("Largest = " + largest);
//     }
// }
// class practice {
//     public static void main(String[] args) {

//         int[] numbers = {10, 45, 23, 67, 12};

//         int largest = numbers[0];

//         for (int i = 1; i < numbers.length; i++) {
//             if (numbers[i] > largest) {
//                 largest = numbers[i];
//             }
//         }

//         System.out.println("Largest = " + largest);
//     }
// }