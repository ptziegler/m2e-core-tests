/*******************************************************************************
 * Copyright (c) 2008 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.maven.ide.eclipse.ui.internal.views.nodes;

import org.eclipse.swt.graphics.Image;

/**
 * MavenRepositoryRootNode
 *
 * @author dyocum
 */
public interface IMavenRepositoryNode {

  public Object[] getChildren();
  public String getName();
  public Image getImage();
  public boolean hasChildren();
}
