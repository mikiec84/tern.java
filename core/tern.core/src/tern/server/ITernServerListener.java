/**
 *  Copyright (c) 2013-2016 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package tern.server;

/**
 * Tern server listener.
 * 
 */
public interface ITernServerListener {

	/**
	 * Method called when the given tern server starts.
	 * 
	 * @param server
	 */
	void onStart(ITernServer server);

	/**
	 * Method called when the given tern server stops.
	 * 
	 * @param server
	 */
	void onStop(ITernServer server);

}
