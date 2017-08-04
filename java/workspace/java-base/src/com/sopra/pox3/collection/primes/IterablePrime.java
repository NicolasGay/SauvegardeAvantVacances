package com.sopra.pox3.collection.primes;

import java.util.Iterator;

public class IterablePrime implements Iterable<Integer> {

	@Override
	public Iterator<Integer> iterator() {
		return new PrimeIterator();
	}

}

class PrimeIterator implements Iterator<Integer> {
	int position = 1;

	@Override
	public boolean hasNext() {
		return position <= 100;
	}

	// fonction from StackOverflow.
	boolean isPrime(int num) {
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

	@Override
	public Integer next() {
		while (!isPrime(position)) {
			position++;
		}
		return position++;

	}

}
