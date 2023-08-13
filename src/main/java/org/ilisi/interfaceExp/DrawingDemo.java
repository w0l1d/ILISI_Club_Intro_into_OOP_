package org.ilisi.interfaceExp;

// Interface representing a drawable object
interface Drawable {
    void draw();
}

// Concrete classes implementing the Drawable interface
class Circle implements Drawable {


    public void draw() {
        System.out.println("Drawing a circle.");
        //draw a circle in the console
        int radius = 5;
        int diameter = radius * 2;
        int centerX = radius;
        int centerY = radius;

        for (int y = 0; y <= diameter; y++) {
            for (int x = 0; x <= diameter; x++) {
                double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
                if (distance > radius - 0.5 && distance < radius + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class Rectangle implements Drawable {

    public void draw() {
        System.out.println("Drawing a rectangle.");
        //create a loop that prints a fill rectangle in the console
        for (int i = 0; i < 5; i++) {
            System.out.println("* * * * *");
        }
    }
}

class Triangle implements Drawable {
    public void draw() {
        System.out.println("\nDrawing a triangle.");
        //draw a full triangle in the console
        for (int i = 0; i < 5; i++) {
            //print the empty spaces
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void draw(int x, float y) {
        System.out.println("Drawing a triangle with x = " + x);
    }

    public void draw(int x, double y) {
        System.out.println("Drawing a triangle with x = " + x + " and y = " + y);
    }
}


// Main class to demonstrate polymorphism using the Drawable interface
public class DrawingDemo {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();

        // Polymorphism in action
        drawShape(circle);
        drawShape(rectangle);
        drawShape(triangle);


    }

    public static void drawShape(Drawable shape) {
        shape.draw(); // Calls the draw method of the specific shape (circle, rectangle, or triangle)
    }
}
