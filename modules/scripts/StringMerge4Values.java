/*----------------------------------------------------------------
*
*	CyberToolBox
*
*	Copyright (C) Satoshi Konno 1998-1999
*
*	File:	StringMerge4Values.java
*
----------------------------------------------------------------*/

public class StringMerge4Values extends Module {

	private String value[] = new String[4];
	
	public void initialize() {
	}

	public void shutdown() {
	}

	public void processData(ModuleNode inNode[], ModuleNode exeNode) {
		for (int n=0; n<4; n++) 
			value[n] = inNode[n].getStringValue();
		sendOutNodeValue(0, value);
	}

}

