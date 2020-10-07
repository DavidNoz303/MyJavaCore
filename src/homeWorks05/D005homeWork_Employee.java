package homeWorks05;

public class D005homeWork_Employee {
    private String fullName;
    private String post;
    private String mail;
    private String phoneNumber;
    private int salary;
    private int age;

    public D005homeWork_Employee(String fullName, String post, String mail, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.mail = mail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.printf("Employee %s : \nPost: %s. \nMail: %s. \nPhone Number: %s. \nSalary: %d. \nAge: %d.\n\n", fullName, post, mail, phoneNumber, salary, age);
    }

    public int getAge() {
        return age;
    }

}
