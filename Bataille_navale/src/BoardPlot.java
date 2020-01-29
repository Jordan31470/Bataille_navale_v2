public class BoardPlot implements Plot{
	private int abscisse;
	private int ordonner;
	
	public BoardPlot(int abscisse,int Ordonner) {
		
		this.abscisse=abscisse;
		this.ordonner=Ordonner;
		
	}

	@Override
	public int getAbscisse() {
		// TODO Auto-generated method stub
		return this.abscisse;
	}

	@Override
	public int getOrdonner() {
		// TODO Auto-generated method stub
		return this.ordonner;
	}

	@Override
	public Plot getPlotTo(Direction direction) {
		// TODO Auto-generated method stub
		switch(direction){
            case NORD:
                return new BoardPlot(this.abscisse+1 ,this.ordonner);
            case SUD:
            	return new BoardPlot(this.abscisse-1,this.ordonner);
            case OUEST:
            	return new BoardPlot(this.abscisse,this.ordonner+1);
            case EST:
            	return new BoardPlot(this.abscisse,this.ordonner-1);
            default:
            	return new BoardPlot(0,0);
        }
    }
}


	