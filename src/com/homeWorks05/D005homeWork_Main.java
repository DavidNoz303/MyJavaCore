package com.homeWorks05;

public class D005homeWork_Main {
    public static void main(String[] args) {

        D005homeWork_Employee[] employees = new D005homeWork_Employee[5];
        employees[0] = new D005homeWork_Employee("Marshal", "JavaDeveloper", "marshal34@gmail.com", "892242572", 40000, 55);
        employees[1] = new D005homeWork_Employee("Andrew", "Web Designer", "anddd53@gmail.com", "592242789", 20000, 34);
        employees[2] = new D005homeWork_Employee("Michael", "Engineer", "mch1234@gmail.com", "496742872", 30000, 49);
        employees[3] = new D005homeWork_Employee("Anastasia", "Freelancer", "nsth667@gmail.com", "992842322", 90000, 21);
        employees[4] = new D005homeWork_Employee("Lucas", "Director", "lucaca7766@gmail.com", "322242772", 100000, 68);

        System.out.println("Employees 40+ age:\n");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].info();
            }
        }
    }

}
