package btu;

import javax.swing.*;

public class Main implements interfaceforsami {
    public int a, b;

    Main(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public void method_1() {
        for (int i = a; i < b; i++) {
            System.out.println(i);
        }
    }

    public void method_2() {
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
    }

    public void method_3() {
        for (int i = 2; i <= b; i++) {
            if (b % i == 0 && !(i % 2 == 0 || i % 3 == 0)) {
                System.out.println(i);
            }

        }
    }

    public void method_4() {
        int[] sixshire = new int[10];

        while (b > 0) {
            int numb = b % 10;
            b /= 10;
            sixshire[numb]++;
        }
        int frequency = 0;
        int index = 0;
        for (int i = 0; i <= 9; i++) {
            if (sixshire[i] > frequency) {
                frequency = sixshire[i];
                index = i;

            }
        }
        System.out.println(index);
    }


    public static void main(String[] args) {
        Main Obj = new Main(10, 121);
 //       Obj.method_1();
//        Obj.method_2();
//        Obj.method_3();
        Obj.method_4();

    }

}


