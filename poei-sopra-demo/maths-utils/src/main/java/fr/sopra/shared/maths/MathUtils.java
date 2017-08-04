package fr.sopra.shared.maths;

public class MathUtils {

	public int factoriel(int n) {

		if (n <= 1)
			return 1;
		return factoriel(n - 1) * n;
	}

}
