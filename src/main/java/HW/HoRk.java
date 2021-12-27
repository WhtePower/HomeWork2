package HW;

public class HoRk {

    public static void main(String[] args) {

        System.out.println("Задание 1.");
        System.out.println(first(6, 2));
        System.out.println(hoRk_3(-7) );
        hoRk_2(3);

    }

    public static boolean first(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void hoRk_2(int y) {

        System.out.println("Задание 2.");
        if (y >= 0) System.out.println(" Число " + y + " положительное ");
        else System.out.println(" Число " + y + " отрицательное ");
    }

    static boolean hoRk_3(int x) {
        System.out.println("Задание 3.");
        return (x > 0);
        }

    }

    
