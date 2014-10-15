/*
 * 
 * @(#)TokenAdminService.java        created on 15/ott/2014
 *
 * Copyright (c) 2007-2014 QuiGroup,
 *
 * This software is the confidential and proprietary information of QuiGroup 
 * Networks srl, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with QuiGroup.
 */
package it.tmp.mexican.csvreader;

import java.io.FileNotFoundException;
import java.io.IOException;



/**
 * Class <code>TokenAdminService.java</code> 
 *
 * @author Domenico Conti [domenico.conti@quigroup.it]
 *
 */
public interface TokenAdminService {
	public void readAndWrite() throws FileNotFoundException, IOException;
}
