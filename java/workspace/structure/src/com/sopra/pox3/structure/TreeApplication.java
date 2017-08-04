package com.sopra.pox3.structure;



//		LEAVES :               a   b    c
//	        	               |    \  /
//	    	                   |     \/
//		                      div   div text  img
//							    \    /    \    /
//							     \  /      \  /
//								  \/        \/
//							      div       p
//	            	 \    /	        \      /
//	        	      \  /           \    /
//	    	           \/             \  /
//		NODES :       head            body 
//						 \            /
//		BRANCHES :        \          /
//	              	   	   \        /
//							\      /
//							 \    /
//	    	                  \  /
//		                       \/
//==================================================================
//		ROOT : 		     	  html



public class TreeApplication {

	public static void main(String[] args) {
		Tree dom = new Tree();
		// dom pour Document Object Model
		dom.root = new Node();
		dom.root.value = "html";
		
		/*
		Branch head = new Branch(); // Eclipse renvoie un warning
		Branch body = new Branch(); // parce que la class Branch est 
									// abstract
		*/
		
		//la syntaxe correcte est :
		BranchWithLeaf head = new BranchWithLeaf();
		head.end = new Leaf();
		head.end.value = "head";
		
		BranchWithNode body = new BranchWithNode();
		body.end = new Node();
		dom.root.branches.add(head);		
		dom.root.branches.add(body);
	}
}
