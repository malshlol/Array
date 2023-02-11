public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
            System.out.println(number[i]);
        }
        double[] number2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }
        int[] kokl = new int[6];
        for (int i = 0; i < kokl.length; i++) {
            kokl[i] = i + 2342345;

            System.out.println(kokl[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] kokl = new int[6];
        for (int i = 0; i < kokl.length; i++) {
            kokl[i] = i + 1;
            System.out.print(kokl[i]);
            if (i != kokl.length - 1) {
                System.out.print(",");
            }
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int[] number = new int[3];
        for (int i = number.length - 1; i >= 0; i--) {
            number[i] = i + 1;
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
            if (number[i] % 2 == 1) {
                number[i]++;
            }
            System.out.println(number[i]);
        }
    }
}


