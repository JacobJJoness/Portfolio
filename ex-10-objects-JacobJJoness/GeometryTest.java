import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.awt.Point;
import java.awt.Rectangle;

public class GeometryTest {
    @Test
    public void distanceTest() {
        
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-7, 6);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(6, -1);
        Point p5 = new Point(-4, -5);
        assertEquals(10.198, Geometry.distance(p1, p2),.001);
        assertEquals(5.0, Geometry.distance(p1, p3),.001);
        assertEquals(5.831, Geometry.distance(p1, p4),.001);
        assertEquals(11.402, Geometry.distance(p1, p5),.001);
        assertEquals(9.220, Geometry.distance(p2, p3),.001);
        assertEquals(14.765, Geometry.distance(p2, p4),.001);
        assertEquals(11.402, Geometry.distance(p2, p5),.001);
        assertEquals(6.083, Geometry.distance(p3, p4),.001);
        assertEquals(6.403, Geometry.distance(p3, p5),.001);
        assertEquals(10.770, Geometry.distance(p4, p5),.001);
        assertEquals(0.0, Geometry.distance(p5, p5),.001);
    }

    @Test
    public void findAreaTest() {
        Rectangle r1 = new Rectangle(10, 10, 40, 50);
        Rectangle r2 = new Rectangle(20, 30, 100, 20);
        Rectangle r3 = new Rectangle(30, 50, 10, 10);
        Rectangle r4 = new Rectangle(10, 50, 15, 15);
        assertEquals(2000.0, Geometry.findArea(r1),.001);
        assertEquals(2000.0, Geometry.findArea(r2),.001);
        assertEquals(100.0, Geometry.findArea(r3),.001);
        assertEquals(225.0, Geometry.findArea(r4),.001);
    }

    @Test
    public void makeRectTest() {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(-7, 6);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(6, -1);
        Rectangle r1 = new Rectangle(3, 4, 10, 20);
        Rectangle r2 = new Rectangle(-7, 6, 20, 30);
        Rectangle r3 = new Rectangle(0, 0, 50, 10);
        Rectangle r4 = new Rectangle(6, -1, 1, 2);
        assertEquals(r1, Geometry.makeRect(p1, 10, 20));
        assertEquals(r2, Geometry.makeRect(p2, 20, 30));
        assertEquals(r3, Geometry.makeRect(p3, 50, 10));
        assertEquals(r4, Geometry.makeRect(p4, 1, 2));
    }

    @Test
    public void getCenterTest() {
        Rectangle r1 = new Rectangle(3, 4, 10, 20);
        Rectangle r2 = new Rectangle(-7, 6, 20, 30);
        Rectangle r3 = new Rectangle(0, 0, 50, 10);
        Rectangle r4 = new Rectangle(6, -1, 1, 2);
        Point c1 = new Point(8, 14);
        Point c2 = new Point(3, 21);
        Point c3 = new Point(25, 5);
        Point c4 = new Point(6, 0);
        assertEquals(c1, Geometry.getCenter(r1));
        assertEquals(c2, Geometry.getCenter(r2));
        assertEquals(c3, Geometry.getCenter(r3));
        assertEquals(c4, Geometry.getCenter(r4));
    }

    @Test
    public void diagLengthTest() {
        Rectangle r1 = new Rectangle(3, 4, 10, 20);
        Rectangle r2 = new Rectangle(-7, 6, 20, 30);
        Rectangle r3 = new Rectangle(0, 0, 50, 10);
        Rectangle r4 = new Rectangle(6, -1, 1, 2);
        assertEquals(22.361, Geometry.diagLength(r1),.001);
        assertEquals(36.056, Geometry.diagLength(r2),.001);
        assertEquals(50.990, Geometry.diagLength(r3),.001);
        assertEquals(2.236, Geometry.diagLength(r4),.001);
    }

    @Test
    public void findPerimeterTest() {
        Rectangle r1 = new Rectangle(3, 4, 10, 20);
        Rectangle r2 = new Rectangle(-7, 6, 20, 30);
        Rectangle r3 = new Rectangle(0, 0, 50, 10);
        Rectangle r4 = new Rectangle(6, -1, 1, 2);
        assertEquals(60, Geometry.findPerimeter(r1));
        assertEquals(100, Geometry.findPerimeter(r2));
        assertEquals(120, Geometry.findPerimeter(r3));
        assertEquals(6, Geometry.findPerimeter(r4));
    }

}