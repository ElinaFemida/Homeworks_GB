package HOMEWORKS_GB.Lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee( String fullName, String position, String email,String phoneNumber, int salary, int age){
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void printInfo () {
        System.out.printf("fullName: %s, position: %s, email: %s, phoneNumber: %s, salary: %s, age: %s %n",fullName, position, email, phoneNumber, salary, age);
    }

}