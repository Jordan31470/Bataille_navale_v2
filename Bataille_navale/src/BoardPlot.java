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
	public Plot getPlotTo(Direction direction) {
		// TODO Auto-generated method stub
		switch(direction)
        {
            case NORD:
                return new BoardPlot(this.Abscisse ,this.Ordonner-1);
                break;
            case SUD:
            	return new BoardPlot(this.Abscisse,this.Ordonner+1);
                break;
            case OUEST:
            	return new BoardPlot(this.Abscisse+1,this.Ordonner);
                break;
            case EST:
            	return new BoardPlot(this.Abscisse-1,this.Ordonner);
            default:
            	return new BoardPlot(0,0);
        }
    }
	}

}

	