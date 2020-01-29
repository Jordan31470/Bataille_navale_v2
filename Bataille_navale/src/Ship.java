import java.util.List;

public class Ship {

	Plot coordonnes;
	ShipModel model;
	Direction direction;
	List<Plot> listeCases;
	
	public Ship ( Plot c,ShipModel m,Direction d ) {
		this.coordonnes = c;
		this.model = m;
		this.direction = d;
	}
		
	public boolean isOnplot(Plot plot) {
			if (this.listeCases.contains(plot)){
				return true;
			}
			else {
				return false;
			}
					
		}
	public void initListCoord() {
		this.listeCases.add(coordonnes);
		for(int i = 1; i<this.model.getTaille();i++) {
			this.listeCases.add(this.listeCases.get(i-1).getPlotTo(direction));
			
		}
	}
	
	public String affichePosition() {
		
	}
	
		
	
}
