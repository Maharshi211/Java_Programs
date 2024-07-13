package Interface;

import java.lang.System;

//class - class --> extends
//class - interface --> implements
//interface - interface --> extends

public interface IFIF {
	
	final int k = 42;

	void first();
	
	
}

interface sec extends IFIF {
	void two();
	
}