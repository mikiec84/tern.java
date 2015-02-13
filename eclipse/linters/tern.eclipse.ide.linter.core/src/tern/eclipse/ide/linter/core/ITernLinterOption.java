/**
 *  Copyright (c) 2013-2015 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package tern.eclipse.ide.linter.core;

import java.util.Collection;

/**
 * Tern linter option API.
 *
 */
public interface ITernLinterOption {

	/**
	 * Returns the identifier of the linter option.
	 * 
	 * @return the identifier of the linter option.
	 */
	String getId();

	/**
	 * Returns the URL of the linter option.
	 * 
	 * @return the URL of the linter option.
	 */
	String getUrl();

	/**
	 * Returns the documentation of the linter option.
	 * 
	 * @return the documentation of the linter option.
	 */
	String getDoc();

	void addOption(ITernLinterOption option);

	/**
	 * Returns the list of options of the linter option.
	 * 
	 * @return the list of options of the linter option.
	 */
	Collection<ITernLinterOption> getOptions();

	/**
	 * Returns true if value of the options is a boolean type and false
	 * otherwise.
	 * 
	 * @return true if value of the options is a boolean type and false
	 *         otherwise.
	 */
	boolean isBooleanType();

	/**
	 * Returns true if value of the options is a number type and false
	 * otherwise.
	 * 
	 * @return true if value of the options is a number type and false
	 *         otherwise.
	 */
	boolean isNumberType();

}
