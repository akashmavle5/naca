/*
 * NacaRT - Naca RunTime for Java Transcoded Cobol programs.
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Publicitas SA.
 * Licensed under LGPL (LGPL-LICENSE.txt) license.
 */
package nacaLib.basePrgEnv;

public interface SessionEnvironmentRequester
{
	String getUserLanguageId();
	String getProfitCenter();
	String getCmpSession();
	String getUserId();
	String getUserLdapId();
}
