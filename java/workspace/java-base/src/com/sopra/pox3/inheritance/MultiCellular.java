package com.sopra.pox3.inheritance;

public class MultiCellular extends Eukarya {

	String cells = "[ - - - - - ]";
	int count;

	public MultiCellular(int count) {
		super(); // pour utliser le syso dans Eukarya
		this.count = count;
	}
	// automatiquement ajouté par le précompilateur pour pouvoir utiliser new
	// MultiCellular()

	String getCells() {
		return cells;
	}

	@Override
	String getCell() {
		return cells;
	}

}
