/*----------------------------------------------------------------
*
*	CyberToolBox for Java
*
*	Copyright (C) Satoshi Konno 1998-1999
*
*	File:	MathDegree2Radian.java
*
----------------------------------------------------------------*/

public class MathDegree2Radian extends Module {

	public void initialize() {
	}

	public void shutdown() {
	}

	public void processData(ModuleNode inNode[], ModuleNode exeNode) {
		
		if (exeNode.isConnected() == true) {
			if (exeNode.getBooleanValue() == false) {
				sendOutNodeValue(0, inNode[0].getStringValue());
				return;
			}
		}

		try {
			double value = inNode[0].getDoubleValue();
			sendOutNodeValue(0, Math.toRadians(value));
		}
		catch (NumberFormatException nfe) {
			sendOutNodeValue(0, Double.toString(Double.NaN));
		}
		
	}

}