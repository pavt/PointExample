package cc3002.point;

/*
 * Model a 2D point and offer simple operations to manipulate points
 */

public class Point {
    private double x, y;

    /*
     * Create a point from to two coordinate
     */
    public Point(double anX, double anY) {
        this.x = anX;
        this.y = anY;
    }

    /*
     * Create a point at (0,0)
     */
    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(Point anotherPoint){
        this.x = anotherPoint.x;
        this.y = anotherPoint.y;
    }


    /*
     *  add two points, this and provided argument point
     *  @param anotherPoint
     *  @return this plus with anotherPoint
     */
    public Point add(Point anotherPoint) {
        return new Point(this.getX() + anotherPoint.getX(), this.getY() + anotherPoint.getY());
    }
    /*
     *  subtract two points, this and provided argument point
     *  @param anotherPoint
     *  @return this subtracted with anotherPoint
     */
    public Point subtract(Point anotherPoint) {
        return new Point(this.getX() - anotherPoint.getX(), this.getY() - anotherPoint.getY());
    }
    /*
     * Return the Y coordinate
     * @return this point Y
     */
    private double getY() {
        return y;
    }

    /*
     * Return the X coordinate
     * @return this point X
     */
    private double getX() {
        return x;
    }

    /*
     * Return a string representation of a point
     * @return the string that correspond to this point
     */
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }


}
