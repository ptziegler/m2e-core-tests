/*******************************************************************************
 * Copyright (c) 2008-2010 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2e.tests.internal.project;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import org.eclipse.m2e.tests.common.AbstractMavenProjectTestCase;


public class MavenProjectChangedListenerExtensionTest extends AbstractMavenProjectTestCase {
  @Test
  public void testExtension() throws Exception {
    TestMavenProjectChangedListener.events.clear();
    TestMavenProjectChangedListener.record = true;

    try {
      importProject("projects/projectimport/p001/pom.xml");
      waitForJobsToComplete();

      assertFalse(TestMavenProjectChangedListener.events.isEmpty());
    } finally {
      TestMavenProjectChangedListener.record = false;
    }
  }
}
