package main;
public class Rectangle {
    private static double width;
    private static double height ;
    public static double computeArea() {
        return width * height;
    }

    public static double getWidth() {
        return width;
    }

    public static void setWidth(double width) {
        Rectangle.width = width;
    }

    public static double getHeight() {
        return height;
    }

    public static void setHeight(double height) {
        Rectangle.height = height;
    }
}
