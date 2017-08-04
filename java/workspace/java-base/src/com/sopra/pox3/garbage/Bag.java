package com.sopra.pox3.garbage;

public class Bag {

	int weight;
	String memoryFill = "kijszdbvc:qsnvn!kqsdj:vcbs:dvjb!skdnv!lqGVBSDJHCB/<KJXBC/KJBC§JSB/CKJBQSXV.QJSVX/KJqBs:lk:khv:jcvlknKJHVF/JHCV /LKHN/KVB /KJBnkjgb:kjb,bv ,hc;jb:cxjs:dN";

	public Bag(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Bag (" + this.weight + " kg)";
	}
	
	protected void finalize() throws Throwable{
		System.out.println("Killing "+this.toString());
	}
	

}
