// import java.util.*;

// public class arrays {
//     public static void main(String args[]) {

//         int marks[] = new int[50];

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter 3 marks:");

//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();

//         System.out.println("phy :" + marks[0]);
//         System.out.println("chem :" + marks[1]);
//         System.out.println("math :" + marks[2]);
//     }
// }
//pass by value in function
// import java.util.*;

// public class arrays {
//     public static void update(int marks[]){
//         for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//         }
//     }
//     public static void main(String args[]){
//         int marks[]={97,98,99};
//         update(marks);
//         for(int i=0;i<marks.length;i++){
//             System.out.print(marks[i]+" ");
//         }
//         System.out.println();
//         }
//     }
//Linear Search
// import java.util.*;
// public class arrays{
//     public static int linearSearch(int numbers[],int key){

//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10,12,14,16};
//         int key=20;

//         int index=linearSearch(numbers, key);
//         if(index==-1){
//             System.out.println("Not found");
//         }else{
//             System.out.println("key is at index:"+ index);
//         }
//     }
// }
//largest number
//Binary Search
// import java.util.*;
// public class arrays {
// public static int binarySearch(int numbers[],int key){
//     int start=0,end=numbers.length-1;
//     while(start<=end){
//         int mid=(start+end)/2;

//         if(numbers[mid]==key){
//             return mid;
//         }
//         if(numbers[mid]<key){
//             start=mid+1;
//         } else{
//             end=mid-1;

//     }
// }
// return -1;
// }
// public static void main(String args[]){
//     int numbers[]={2,4,6,8,10,12,14};
//     int key=10;
//     System.out.println("index for key is:" + binarySearch(numbers,key));
// }
// }
//Reverse the array
// import java.util.*;
// public class arrays{
// public static void Reverse(int numbers[]){
//     int first=0,last=numbers.length-1;

//     while(first<last){
//         int temp=numbers[last];
//         numbers[last]=numbers[first];
//         numbers[first]=temp;

//         first++;
//         last--;
//     }
// }
// public static void main(String args[]){
//     int numbers[]={2,4,6,8,10};

//     Reverse(numbers);
//     for(int i=0;i<numbers.length;i++){
//         System.out.print(numbers[i]+" ");
//     }
//     System.out.println();

// }
// }
