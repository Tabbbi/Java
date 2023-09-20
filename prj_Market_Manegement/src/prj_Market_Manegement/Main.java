package prj_Market_Manegement;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {		
		ArrayList<Shelf> shelfs = new ArrayList<Shelf>();
		Shelf shelf = new Shelf(5, 5);
		shelfs.add(shelf);
		
		Tomatosoup tomatosoup = new Tomatosoup(1, 6, 0.250, 2.50, "Tomatosoup");
		shelf.addProductStack(0, 0, tomatosoup);
		shelf.addItemToStack(0, 0, tomatosoup);
		shelf.addItemToStack(0, 0, tomatosoup);
		shelf.removeItemFromStack(0, 0);
		shelf.isShelfplaceEmpty(0, 0);
		shelf.isShelfplaceEmpty(0, 1);
		shelf.isStackEmpty(0, 0);
		shelf.show();
	}

}
