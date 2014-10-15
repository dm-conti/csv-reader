/**
 * 
 */
package it.tmp.mexican.csvreader;

import java.io.FileNotFoundException;
import java.io.IOException;

import it.tmp.mexican.csvreader.impl.TokenAdminServiceImpl;

/*
 * @(#)MainCSV.java        created on 15/ott/2014
 *
 * Copyright (c) 2007-2014 QuiGroup,
 *
 * This software is the confidential and proprietary information of QuiGroup 
 * Networks srl, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with QuiGroup.
 */

/**
 * Class <code>MainCSV.java</code> 
 *
 * @author Domenico Conti [domenico.conti@quigroup.it]
 *
 */

public class MainCSV {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		TokenAdminService service = new TokenAdminServiceImpl();
		service.readAndWrite();
	}

}
