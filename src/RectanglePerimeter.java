
public class RectanglePerimeter {
	 double width =4;
	 double height=40;
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
