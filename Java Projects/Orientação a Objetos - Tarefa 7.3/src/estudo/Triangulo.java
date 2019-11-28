package estudo;

public class Triangulo extends FiguraGeometrica {
	private float a;
	private float b;
	private float c;
	
	@Override 
	public float area() {
		return 0;	
	}
	
	@Override
	public float perimetro() {
		return a+b+c;
	}
	
	public float GetA() {
		return a;
	}
	
	public void setA(float a) {
		this.a = a;
	}
	
	public float getB() {
		return b;
	}
	
	public void setB(float b) {
		this.b = b;
	}
	
	public float getC() {
		return c;
	}
	
	public void setC(float c) {
		this.c = c;
	}
	
}
