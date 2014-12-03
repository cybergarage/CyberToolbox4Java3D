/******************************************************************
*
*	CyberToolBox for Java
*
*	Copyright (C) Satoshi Konno 1998
*
*	File:	NFFFileFilter.java
*
******************************************************************/

import java.io.*;
import javax.swing.filechooser.FileFilter;

public class NFFFileFilter extends FileFilter {
	final static String ext = "nff";
	public boolean accept(File f) {
		if(f.isDirectory())
			return true;
		String s = f.getName();
		int i = s.lastIndexOf('.');
		if(i > 0 &&  i < s.length() - 1) {
			String extension = s.substring(i+1).toLowerCase();
			if (ext.equals(extension) == true) 
				return true;
			else
				return false;
		}
		return false;
	}
	public String getDescription() {
		return "NFF Files (*.nff)";
	}
}

