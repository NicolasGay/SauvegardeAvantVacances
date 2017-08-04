package com.sopra.pox3.structure;

import java.util.ArrayList;
import java.util.List;

//     LEAVES :                a   b    c
//                             |    \  /
//                             |     \/
//                            div   div text  img
//  							\    /    \    /
//								 \  /      \  /
//								  \/        \/
//						          div       p
//                   \    /	        \      /
//                    \  /           \    /
//                     \/             \  /
//     NODES :        head            body 
//						 \            /
//     BRANCHES :         \          /
//                         \        /
//							\      /
//							 \    /
//                            \  /
//                             \/
//==================================================================
//     ROOT : 		     	  html



public class Tree {

		Node root;  		// la racine est un noeud particulier
							// on aurait pu cr�er une class Root extends 
							// Node{} et d�clarer un Root root;
}

class Node{
	List<Branch> branches = new ArrayList<>();
	String value;
}

abstract class Branch{ 		// avec abstract on interdit la cr�ation v�ritable de la class Branch
							// on utilise une abstract class parce que Branch est d�finie comme ne pouvant pas avoir de fin
	Node start;				// (ce qui est aberrant en r�alit�)
	
}

class BranchWithNode extends Branch{
	
	Node end;
	
}

class BranchWithLeaf extends Branch{
	
	Leaf end;
	
}

class Leaf{
	
	String value;
	
}