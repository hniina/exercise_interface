public class Rectangle implements Comparable<Rectangle> {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
         this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height; }

    // Compare by area
    @Override

    public int compareTo(Rectangle other) {
        return Double.compare(this.calculateArea(), other.calculateArea());}
}
