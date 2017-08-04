package com.sopra.pox3.collection.primes;

import java.util.Iterator;

public class IterableInteger implements Iterable<Integer> {
	// le contrat de iterable est d'avoir un iterator

	@Override
	public Iterator<Integer> iterator() {
		return new IntIterator();
	}

}

class IntIterator implements Iterator<Integer> {
	// le contrat d'un iterator est d'avoir un hasNext()

	int position = 1;

	@Override
	public boolean hasNext() {
		return position <= 100;

		// EQUIVALENT DE
		// if(position <= 100){
		// return true;
		// }else{
		// return false;
		// }
	}

	@Override
	public Integer next() {
		int result = position;
		position++;
		return result;
	}

}
