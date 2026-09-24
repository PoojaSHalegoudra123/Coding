//simple addtion using method
/*import java.util.*;
public class methods {
    
    static void addition(){//defenition of method
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        num1=sc.nextInt();
        System.out.println("enter second number");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("the sum is:"+sum );
    }
public static void main(String[] args){
    addition();
}
}*/
//with return type without argument
/*import java.util.*;
public class methods{
    static int addition(){
        int num1,num2,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        num1=sc.nextInt();
        System.out.println("enter the 2nd num");
        num2=sc.nextInt();
        sum=num1+num2;
        return sum;
    }
    public static void main(String[] args){
        System.out.println("the sum is:"+addition());
    }
}*/
//with return type and with arguments
/*blic class methods{
    static int addition(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        System.out.println("the sum is"+addition(1,3));
    }
}*/
//without return type and with arguments
/*public class methods{
    static void addition(double a,double b){
        double s=a+b;
        System.out.println("the sum is :"+s);
    }
    public static void main(String[] args){
        addition(4.45,5.6);
}}*/
//method signatur 
/*public class methods{
    static void findSquareRoot(int num){
        if(num<0){
            System.out.println("can not find");
        }}
    public static void main(String[] args){
    System.out.println(Math.sqrt(-4));
}
}*/