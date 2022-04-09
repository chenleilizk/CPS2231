
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4,40);
		Rectangle rect2 = new Rectangle(3.5,35.9);
		System.out.println("Rect1 width is "+rect1.width);
		System.out.println("Rect1 width is "+rect1.height);
	}
	public class RectanglePerimeter {
		 double width;
		 double height;
		 RectanglePerimeter(){
		 }
		 RectanglePerimeter(double newWidth, double newHeight){
			 width= newWidth;
			 height= newHeight;
		 }
		 double getPerimeter() {
			 return 2*(width+height);
		 }
		 double getArea() {
			 return width*height;
		 }
		 void setWidth(double newWidth) {
			 width= newWidth;
		 }
		 void setHeight(double newHeight) {
			 width= newHeight;
		 }
	}

}
