package figura;

public class Circulo extends FiguraGeometrica implements Calcula {
	
	private int raio, area;
	private double i;
	
	public Circulo(int raio, int area, double i, String cor) {
		super(cor);
		this.raio = raio;
		this.area = area;
		this.i = i;
	}

	@Override
	public boolean compare(FiguraGeometrica o) {
		Circulo c = (Circulo) o;
		return c.raio == this.raio && c.area == this.area
				&& this.getCor().equals(c.getCor());
	}

	@Override
	public double Area() {
		return Math.PI * (i * i);
	}

	@Override
	public double Perimetro() {
		return 2 * Math.PI * i;
	}
	
	@Override
	public boolean interseccao(FiguraGeometrica o) {
		Circulo c = (Circulo) o;
		return c.raio == this.raio && c.area == this.area;
	}
}