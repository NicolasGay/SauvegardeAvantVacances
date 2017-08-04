package com.sopra.pox3.manhattan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Solution {

	public static void main(String args[]) {

		int L = 4; // largeur d'une lettre
		int H = 5; // hauteur d'une lettre

		String T = "MANHATTAN"; // texte à encoder en ASCII art

		List<String> alphabet = new ArrayList<>();

		alphabet = Arrays.asList(
				" #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ",
				"# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ",
				"### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ",
				"# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ",
				"# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ");

		char lettre = '?'; // ASCII : ?

		Map<Character, List<String>> lettersMap = new HashMap<>();
		List<Character> listeLettres = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
				'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '?');

		for (int i = 1; i < 28; i++) {

			lettre = listeLettres.get(i - 1);
			List<String> lettreASCII = new ArrayList<>();

			for (int hauteur = 0; hauteur < H; hauteur++) {

				char[] dest = new char[L];
				alphabet.get(hauteur).getChars(L * (i - 1), L * (i - 1) + (L), dest, 0);
				String string = String.valueOf(dest);
				lettreASCII.add(string);
			}

			lettersMap.put(lettre, lettreASCII);

		} // fin construction lettersMap;

		Set<Character> lettersSet = new HashSet<Character>();
		lettersSet = lettersMap.keySet();

		ArrayList<Character> charsFromT = new ArrayList<Character>();
		for (char c : T.toCharArray()) {
			charsFromT.add(c);
		}

		String superLine = "";

		for (int iteration = 0; iteration < H; iteration++) {

			String line = "";

			for (int l = 0; l < charsFromT.size(); l++) {

				char lettreUPPER = Character.toUpperCase(charsFromT.get(l));

				if (lettersSet.contains(lettreUPPER)) {

					// line = line + lettersMap.get(lettreUPPER).get(iteration);
					line = line.concat(lettersMap.get(lettreUPPER).get(iteration));

				} else {

					lettreUPPER = '?';
					// line = line + lettersMap.get(lettreUPPER).get(iteration);
					line = line.concat(lettersMap.get(lettreUPPER).get(iteration));

				}

			}

			superLine += line + "\n";
		}

		System.out.println(superLine);

	}

}
