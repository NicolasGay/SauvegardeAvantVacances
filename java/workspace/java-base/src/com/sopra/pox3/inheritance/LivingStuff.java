package com.sopra.pox3.inheritance;

import java.util.List;

public interface LivingStuff {

	// List<LivingStuff> multiply();
	List<? extends LivingStuff> multiply();
	// on fait une liste de n'importe quoi, on consid�re que ce n'importe quoi
	// extends LivingStuff
	
	void eat();

	void die();

}
