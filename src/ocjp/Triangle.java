package ocjp;

public class Triangle {
    public static void main(String[] args) {
      //  Point  p =  Line.getPoint();
        //Point  p =  (new Line()).getPoint();
   // Line.Point p = Line.getPoint();
         Line.Point p = (new Line()).getPoint();

    }


}
class Line{
    public class Point{
        public int x, y;
    }
    public Point getPoint() {
        return new Point();
    }
}