public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 7");
        var a = 5;
        var b = 7;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}