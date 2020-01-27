public class BoardPlot implements Plot{
	private int Abscisse;
	private int Ordonner;
	
	public BoardPlot(int Abscisse,int Ordonner) {
		
		this.Abscisse=Abscisse;
		this.Ordonner=Ordonner;
		
	}

	@Override
	public int getAbscisse() {
		// TODO Auto-generated method stub
		return this.Abscisse;
	}

	@Override
	public int getOrdonner() {
		// TODO Auto-generated method stub
		return this.Ordonner;
	}

	@Override
	public int getPlotTo(Direction direction) {
		// TODO Auto-generated method stub
		return 0;
	}

}

	