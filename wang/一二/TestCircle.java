/*
 * -radius:float
 * -----------------
 * +Circle(radius:float)
 * +area():float
 * +girth():float
 */
class Circle{
	private float radius;
	Circle(float radius){
		this.radius = radius;
	}
	public float area(){
		return (float)Math.PI*this.radius*this.radius;
	}
	public float girth(){
		return (float)Math.PI*this.radius*2;
	}
}
class TestCircle{
	public static void main(String[] args){
		Circle circle = new Circle(3.1f);
		System.out.println("area:"+circle.area()+" "+"Perimeter:"+circle.girth());
	}
}
