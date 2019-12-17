import java.awt.Point;
import java.awt.Rectangle;



public class Geometry {

    /**
     * Calculates the distance between two points
     * @param p1 - first point
     * @param p2 - second point
     * @return the distance between the two points
     */
    public static double distance(Point p1, Point p2) {
        int x = p2.x - p1.x;
        int y = p2.y - p1.y; 
        return Math.sqrt(x * x + y * y);
    

    }

    /**
     * Finds the area of a Rectangle
     * @param rect - the Rectangle to find the area of
     * @return the area of the rectangle
     */
    public static int findArea(Rectangle rect) {
        int length = rect.width;
        int width = rect.height;
        return(length*width);

    }

    /**
     * Makes a Rectangle object
     * @param topLeft - a Point at the top left of the rectangle
     * @param width - the width of the rectangle
     * @param height - the height of the rectangle
     * @return a Rectangle object 
     */
    public static Rectangle makeRect(Point topLeft, int width, int height) {
        int dx = topLeft.x;
        int dy = topLeft.y;
        Rectangle rect = new Rectangle(dx,dy, width, height);
        return rect;
    }

    /**
     * Find the Point at the center of a rectangle
     * @param rect - the rectangle
     * @return a Point that is at the approximate center of the rectangle
     */
    public static Point getCenter(Rectangle rect) {
        int x =rect.width / 2+ rect.x;
        int y = rect.height / 2 + rect.y;
        return new Point(x, y);
    }

    /**
     * Find the length of the diagonal of a rectangle
     * @param rect - the Rectangle
     * @return the length of the diagonal of the rectangle
     */
    public static double diagLength(Rectangle rect) {
        double pythagFirst = ((rect.height*rect.height) + (rect.width*rect.width));
        double pythagSec = Math.sqrt(pythagFirst);
        return pythagSec;
    }

    /**
     * Find the perimeter of a rectangle
     * @param rect - the Rectangle
     * @return the perimeter of the rectangle
     */
    public static int findPerimeter(Rectangle rect) {
        return((rect.height*2)+(rect.width*2));
    }


    
}