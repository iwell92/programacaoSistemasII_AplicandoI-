package figura;

public abstract class FiguraGeometrica {
	
	private String cor;

	public FiguraGeometrica(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public abstract boolean compare(FiguraGeometrica o);
	
	public abstract double Area();
	
	public abstract double Perimetro();
}