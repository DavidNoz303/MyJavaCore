package homeWorks;

// Задание № 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();

public class D001homeWork {
    public static void main(String[] args) {
        System.out.println("Задание № 1 : Я создал проект и прописал в нем метод main,"+"\n"
                +"              блогадаря которому работает этот проект и в консоле мы видим все решения заданий."+"\n"
                +"              С уважением, Давид Нозрачёв!"+"\n");

// Задание № 2.Создать переменные всех пройденных типов данных, и инициализировать их значения;

        byte q = 120;
        byte q1 = Byte.MAX_VALUE;
        byte q2 = Byte.MIN_VALUE;

        short w = 1200;
        short w1 = Short.MAX_VALUE;
        short w2 = Short.MIN_VALUE;

        int e = 20000;
        int e1 = Integer.MAX_VALUE;
        int e2 = Integer.MIN_VALUE;

        long r = 10000000l;
        long r1 = Long.MAX_VALUE;
        long r2 = Long.MIN_VALUE;

        float t = 2.5f;
        float t1 = Float.MAX_VALUE;
        float t2 = Float.MIN_VALUE;

        double p = 2.3687687;
        double p1 = Double.MAX_VALUE;
        double p2 = Double.MIN_VALUE;

        char u = 'A';
        char u1 = Character.MAX_VALUE;
        char u2 = Character.MIN_VALUE;

        boolean i = false;
        boolean o = true;

        System.out.println("Задание № 2 : Variable Byte : " + q + " ," + q1 + " ," + q2 + "."+"\n"
                +"\t\t\t  "+"Variable Short : " + w +" ," + w1 +" ," + w2 + "."+"\n"
                +"\t\t\t  "+"Variable Integer(int) : " + e +" ," + e1 +" ," + e2 + "."+"\n"
                +"\t\t\t  "+"Variable Long : " + r +" ," + r1 +" ," + r2 + "."+"\n"
                +"\t\t\t  "+"Variable Float : " + t +" ," + t1 +" ," + t2 + "."+"\n"
                +"\t\t\t  "+"Variable Double : " + p +" ," + p1 +" ," + p2 + "."+"\n"
                +"\t\t\t  "+"Variable Character(char) : " + u +" ," + u1 +" ," + u2 + "."+"\n"
                +"\t\t\t  "+"Variable Boolean : " + i +" or " + o +"." + "\n");

//-----------------------------Задание № 3 ------------------------------------------

        System.out.println("Задание № 3 :" + calculate1(1, 2, 3, 4) + "\n");

//-----------------------------Задание № 4 ------------------------------------------

        System.out.println("Задание № 4 :" + task10and20(10, 20) + "\n");

//-----------------------------Задание № 5 ------------------------------------------

        isPositiveOrNegative(-5);

//-----------------------------Задание № 6 ------------------------------------------

        System.out.println("Задание № 6 :" + isNegative(5) + "\n");

//-----------------------------Задание № 7 ------------------------------------------
        greetings("Leonid");

//-----------------------------Задание № 8 ------------------------------------------

        System.out.println(isLeapYear(2004));

    }


    // Задание № 3.Написать метод вычисляющий выражение a * (b + (c / d)) и
// возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int calculate1(int a, int b, int c, int d)
    {
        return a * (b + (c / d));
    }

    /* Задание № 4
    Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
     лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
      в противном случае – false.
     */

    public static boolean task10and20(int x1, int x2) {
        int sum = x1 + x2;
        boolean bool = true;
        if (sum >= 10 || sum <= 20) {
            bool = true;
        }
        if (sum < 10 || sum > 20) {
            bool = false;
        }
        return bool;
    }

    /*Задание № 5
    Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное,
     и вернуть false если положительное.
     */
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Задание № 5 :"+"Вы ввели положительное число!"+ "\n");
        } else {
            System.out.println("Задание № 5 :"+"Вы ввели отрицательное число!" +"\n");
        }
    }

    /*Задание № 6
   Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
   если число отрицательное, и вернуть false если положительное.
     */
    public static boolean isNegative(int x) {
        if (x <= 0) {
            return true;
        }
        return false;
    }

    /*Задание № 7
    Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */

    public static void greetings(String name) {
        System.out.println("Задание № 7 :"+"Hello, " + name + "!" + "\n");

    }
    /*Задание № 8
    Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    public static boolean isLeapYear (int year){
        if( ((year % 4 == 0)  && (year % 100 != 0) || (year % 400 == 0))){
            System.out.println("Задание № 8 :"+"Этот год является высокосным годом!");
            return true;
        }else
        {
            System.out.println("Задание № 8 :"+"Этот год не является высокосным годом!");
            return false;
        }
    }
}
