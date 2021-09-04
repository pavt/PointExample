package cc3002.point;


public class PointExample {
    public static void main(String[] args) {
        Point pointA = new Point(1,2);
        Point pointB = new Point(2, 4);
        Point pointAtZero = new Point();

        System.out.println(pointA.add(pointB));
        System.out.println(pointA.subtract(pointB));
        System.out.println(pointAtZero);
        System.out.println(new Point(pointA));
    }
}
