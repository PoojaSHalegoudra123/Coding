// class Student {
//     String name = "Pooja";
//     int age = 21;

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//     }

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.display();
//     }
// }

// class Student {
//     String name;
//     int age;

//     void display() {
//         System.out.println(name + " " + age);
//     }

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "Pooja";
//         s1.age = 21;

//         Student s2 = new Student();
//         s2.name = "Ravi";
//         s2.age = 22;

//         s1.display();
//         s2.display();
//     }
// }
// class Employee {
//     String name;
//     int salary;

//     Employee(String n, int s) {
//         name = n;
//         salary = s;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Salary: " + salary);
//     }

//     public static void main(String[] args) {
//         Employee e1 = new Employee("Pooja", 30000);
//         e1.display();
//     }
// }
// class Rectangle {
//     int length;
//     int breadth;

//     void calculateArea() {
//         int area = length * breadth;
//         System.out.println("Area: " + area);
//     }

//     public static void main(String[] args) {
//         Rectangle r1 = new Rectangle();

//         r1.length = 10;
//         r1.breadth = 5;

//         r1.calculateArea();
//     }
// }
// class Student {
//     static String college = "VTU";
//     String name;

//     Student(String n) {
//         name = n;
//     }

//     void display() {
//         System.out.println(name + " - " + college);
//     }

//     public static void main(String[] args) {
//         Student s1 = new Student("Pooja");
//         Student s2 = new Student("Ravi");

//         s1.display();
//         s2.display();
//     }
// }
