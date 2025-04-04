public class Student {
    String name;
    int age;
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 20);
        Student s2 = new Student("Amit", 20);
        s1.displayInfo();
        s2.displayInfo();
    }
}
