public class Main {
    public static void main(String[] args) {
        task6();
        task7();
        task8();
    }

    public static void task6(){
        System.out.println("Задача 6");
        var a = 12;
        var b = 27;
        var c = 44;
        var d = 15;
        var e = 9;
        var result =  a * (b + (c - d * e));
        result = - result;
        System.out.println(result);
    }

    public static void task7(){
        System.out.println("Задача 7");
        var a = 5;
        var b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void task8(){
        System.out.println("Задача 8");
        var a = 495;
        var b = a % 100;
        b = b / 10;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}