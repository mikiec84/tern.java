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
package tern.server.protocol.outline;

import tern.server.protocol.IJSONObjectHelper;
import tern.server.protocol.ITernResultProcessor;
import tern.server.protocol.TernDoc;

public class TernOutlineResultProcessor implements ITernResultProcessor<ITernOutlineCollector> {

	public static final TernOutlineResultProcessor INSTANCE = new TernOutlineResultProcessor();

	private static final String OUTLINE_FIELD_NAME = "outline";

	@Override
	public void process(TernDoc doc, IJSONObjectHelper jsonObjectHelper, Object jsonObject,
			ITernOutlineCollector collector) {
		Iterable<Object> outline = jsonObjectHelper.getList(jsonObject, OUTLINE_FIELD_NAME); // $NON-NLS-1$
		JSNodeRoot root = new JSNodeRoot();
		if (outline != null) {
			addChildren(outline, root, jsonObjectHelper);
		}
		collector.setRoot(root);
	}

	protected void addChildren(Iterable<Object> jsonNodes, JSNode parent, IJSONObjectHelper helper) {
		String nodeName = null;
		String nodeType = null;
		String type = null;
		JSNode node = null;
		for (Object jsonNode : jsonNodes) {
			nodeName = helper.getText(jsonNode, "name");
			nodeType = helper.getText(jsonNode, "type");
			node = new JSNode(nodeName, nodeType, type);
			parent.addChild(node);
		}
	}

}
