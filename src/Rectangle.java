public class Rectangle {
    private double length;
    private double width;
    private int x;
    private int y;

    public Rectangle(double length,double width,int x,int y)
    {
        this.x=x;
        this.y=y;
        this.length=length;
        this.width=width;

    }
    public boolean isOverlapping(Rectangle other){
        if(x<other.x+other.width &&x+width>other.x&&y<other.y+other.length&&y+length>other.y){
            return true;
        }
        else
            return false;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
public double calculateArea(){
        return length*width;
}
public double calculatePerimeter(){
        return 2*(length+width);
}
public Rectangle getMinRect(Rectangle rect, Rectangle rect2){
        if (rect.calculateArea()<rect2.calculateArea())
            return rect;
        else
            return rect2;
}

}
