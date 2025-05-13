public class Polynomial {
	double[] coeff;
	
	public Polynomial() {
		this.coeff = new double[]{0};
	}
	
	public Polynomial(double[] coeff) {
		this.coeff = coeff;
	}
	
	public Polynomial add(Polynomial a) {
		int xlen = this.coeff.length;
		int ylen = a.coeff.length;
		int len = Math.max(xlen, ylen);
		double[] sum = new double[len];

		for (int i = 0; i < len; i++) {
			double x,y;
			if (i >= xlen) x = 0;
			else x = this.coeff[i];
			if (i >= ylen) y = 0;
			else y = a.coeff[i];
			
			sum[i] = x + y;
		}
		
		return new Polynomial(sum);
	}
	
	public double evaluate(double x) {
		int power = 0;
		double result = 0;
		for (double i : this.coeff) {
			result += i * Math.pow(x, power);
			power++;
		}
		return result;
	}
	
	public boolean hasRoot(double root) {
		return this.evaluate(root) == 0;
	}
}