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
		
	
}
