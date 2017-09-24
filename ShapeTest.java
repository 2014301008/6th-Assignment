class Shape {
	protected int x = 1,y= 1;
	public void draw() {
		System.out.println("Shape Draw : x= " +this.x + ", y=" +this.y);
	}
	Shape() {
		this.x = x;
		this.y = y;
	}
}

class Rectangle extends Shape {
	private int width, height;
	public void draw() {
		System.out.println("Rectangle Draw : x= " + x + ", y= " + y + ", width =" + width + ", height=" + height);
	}
	Rectangle(int x,int y,int width,int height){
		super.x = x;
		super.y = y;
		this.width = width;
		this.height = height;
	}
}

class Triangle extends Shape {
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw : x= " + x + ", y= " + y + ", base= " + base + ", height=" + height);
	}
	Triangle(int x,int y,int base,int height){
		super.x = x;
		super.y = y;
		this.base = base;
		this.height = height;
	}
}

class Circle extends Shape {
	private int radius;
	public void draw() {
		System.out.println("Triangle Draw : x= " + x + ", y= " + y + ", radius= " + radius);
	}
	Circle(int x,int y,int radius){
		super.x = x;
		super.y = y;
		this.radius = radius;
	}
}

public class ShapeTest {
	private static Shape arrayOfShapes[];

	public static void main(String[] args) {
		init();
		drawAll();
	}
	public static void init() {
		arrayOfShapes = new Shape[4];
		arrayOfShapes[0] = new Shape();
		arrayOfShapes[1] = new Rectangle(3,4,10,20);
		arrayOfShapes[2] = new Triangle(4,5,20,30);
		arrayOfShapes[3] = new Circle(5,6,40);
	}
	public static void drawAll() {
	for(int i = 0;i<arrayOfShapes.length;i++) {
		arrayOfShapes[i].draw();
	}
	}
}
