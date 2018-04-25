/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.jersey.server;

import org.glassfish.jersey.internal.BootstrapBag;
import org.glassfish.jersey.internal.BootstrapConfigurator;
import org.glassfish.jersey.internal.inject.InjectionManager;

/**
 * Configurator which initializes and register configuration.
 *
 * @author Petr Bouda
 */
public class TestConfigConfigurator implements BootstrapConfigurator {

    private final ResourceConfig runtimeConfig;

    /**
     * Create test runtime config configurator with dummy resource config.
     */
    public TestConfigConfigurator() {
        this(new ResourceConfig());
    }

    /**
     * Create test runtime config configurator with dummy resource config.
     *
     * @param runtimeConfig dummy resource config.
     */
    public TestConfigConfigurator(ResourceConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    @Override
    public void init(InjectionManager injectionManager, BootstrapBag bootstrapBag) {
        bootstrapBag.setConfiguration(runtimeConfig);
    }

    @Override
    public void postInit(InjectionManager injectionManager, BootstrapBag bootstrapBag) {
    }

}
