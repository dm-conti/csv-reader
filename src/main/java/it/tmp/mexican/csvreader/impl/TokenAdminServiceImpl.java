/*
 * 
 * @(#)TokenAdminServiceImpl.java        created on 15/ott/2014
 *
 * Copyright (c) 2007-2014 QuiGroup,
 *
 * This software is the confidential and proprietary information of QuiGroup 
 * Networks srl, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with QuiGroup.
 */
package it.tmp.mexican.csvreader.impl;

import it.tmp.mexican.csvreader.TokenAdminService;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * Class <code>TokenAdminServiceImpl.java</code> 
 *
 * @author Domenico Conti [domenico.conti@quigroup.it]
 *
 */
public class TokenAdminServiceImpl implements TokenAdminService {
	
	@Override
	public void readAndWrite() throws IOException {
		
		FileWriter writer = new FileWriter("export_out.csv");
		Scanner scanner = new Scanner(new FileReader("export.csv"));		
		
		while (scanner.hasNext()){
			String row = scanner.next();
			
			for(int i=0; i<99; i++){
				writer.append(row + '\n');				
			}
			
		}
		
		writer.flush();
	    writer.close();	
	    scanner.close();
	}
}