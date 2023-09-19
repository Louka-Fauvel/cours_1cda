package poo.interfaces;

public class Circle implements Forme {

	private double rayon;
	
	public Circle(double rayon) {
		this.setRayon(rayon);
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculerAire() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
