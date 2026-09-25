//with same return type
/*public class methodoverloading {
    static void print(int a){
        System.out.println("printing integer value:"+a);
    }
    static void print(double a){
        System.out.println("printing integer value:"+a);
    }
    static void print(String str){
        System.out.println("printing string value:"+str);
    }
    public static void main(String[] args){
        print(5);
        print("pooja");
        print(7.86);
    }
}*/
// with different return type
/*public class methodoverloading {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
public static void main(String[] args){
        add(5,6);
        int result=add(4,6,9);
        System.out.println(result);
}
}*/
//with different parameter
/*public class methodoverloading {
    double add(int a,double b){
        return a+b;
    }
    double add(double a,int b,int c){
        return a+b+c;
    }
public static void main(String[] args){
        methodoverloading obj=new methodoverloading();
        System.out.println(obj.add(2,3.2));
        double result=obj.add(2.2,4,5);
System.out.println(result);
}
}*/
