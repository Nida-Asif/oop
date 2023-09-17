public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(23, 23, 5, 5);
        Rectangle rect2 = new Rectangle(33, 44, 2, 3);
        System.out.println(rect.calculateArea());
        System.out.println(rect.calculatePerimeter());
        Rectangle smallRec = rect.getMinRect(rect, rect2);
        if (rect.isOverlapping(rect2)) {
            System.out.println("Rectangles overlapp");
        } else {
            System.out.println("Rectangles dont overlapp");

        }
    }
}