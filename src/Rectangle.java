
public class Rectangle {
	double width = 1.0;
	double height = 1.0;
Rectangle(double newWidth,double newHeight){
	width = newWidth;
    height = newHeight;
}
double getArea() {
	return width*height;
}
}