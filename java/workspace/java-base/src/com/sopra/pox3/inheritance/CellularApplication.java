package com.sopra.pox3.inheritance;

public class CellularApplication {

	public static void main(String[] args) {

		MultiCellular mCellular = new MultiCellular(22);
		
		
		System.out.println(mCellular.getCell());
		// si on n'avait pas mis de Override dans la classe Multicellular, on
		// aurait affiché cell au lieu de [ - - - - - ]
		System.out.println(mCellular.getCells());
		
		Polychaeta popo = new Polychaeta();

	}

}
