/*----------------------------------------------------------------
*
*	CyberToolBox
*
*	Copyright (C) Satoshi Konno 1998-1999
*
*	File:	MaterialSetAmbientIntensity.java
*
----------------------------------------------------------------*/

import cv97.*;
import cv97.node.*;
import cv97.field.*;

public class MaterialSetAmbientIntensity extends Module {

	private SceneGraph		sg;
	private MaterialNode	matNode;
	private float				ambIntensity;
			
	public void initialize() {
		sg = getSceneGraph();
		
		String matName = getStringValue();
		if (matName != null)
			matNode = sg.findMaterialNode(matName);
		else
			matNode = null;
	}

	public void shutdown() {
	}

	public void processData(ModuleNode inNode[], ModuleNode exeNode) {
		
		if (exeNode.isConnected() == true) {
			if (exeNode.getBooleanValue() == false) 
				return;
		}

		if (inNode[0].isConnected() == true) {
			String matName = inNode[0].getStringValue();
			if (matName != null) {
				matNode = sg.findMaterialNode(matName);
				if (matNode != null) 
					setValue(matName);
				else
					setValue("");
			}
			else {
				matNode = null;
				setValue("");
			}
		}

		try {
			ambIntensity = inNode[1].getFloatValue();
		}
		catch (NumberFormatException nfe) {
			ambIntensity = -1.0f;
		};

		if (matNode != null && 0.0 <= ambIntensity) 
			matNode.setAmbientIntensity(ambIntensity);
	}

}
