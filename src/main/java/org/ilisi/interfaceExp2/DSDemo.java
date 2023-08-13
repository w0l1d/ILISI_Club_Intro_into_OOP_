package org.ilisi.interfaceExp2;

interface Drawable {
    public void draw();
}

class Triangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Triangle");
        //print a triangle in console
        for (int j = 0; j < 5; j++)
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }

    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
        //draw a Rectanlge in console
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}




public class DSDemo {
    public static void printShape (Drawable d) {
        //
        d.draw();
    }

    public static void main(String[] args) {
        printShape(new Triangle());

        System.out.println();;
        printShape(new Rectangle());

    }

    public int add(int a, float b)  {
        return 0;
    };

    public int add(float a, int b)  {
        return 0;
    };

    public int add(int a, int b)  {
        return 0;
    };

    public void test() {
        add(1, 2.0f);
        add( 2.0f, 1);
        add(1, 2);
    }

}


