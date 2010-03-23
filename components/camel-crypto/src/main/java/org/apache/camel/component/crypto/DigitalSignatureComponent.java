/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.crypto;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.impl.DefaultComponent;
import org.apache.camel.util.ObjectHelper;

/**
 * <code>DigitalSignatureComponent</code>
 */
@SuppressWarnings("unchecked")
public class DigitalSignatureComponent extends DefaultComponent {

    private DigitalSignatureConfiguration configuration;

    public DigitalSignatureComponent() {
    }

    public DigitalSignatureComponent(CamelContext context) {
        super(context);
    }

    protected Endpoint createEndpoint(String uri, String remaining, Map parameters) throws Exception {
        ObjectHelper.notNull(getCamelContext(), "CamelContext");

        DigitalSignatureConfiguration config = getConfiguration().copy();
        setProperties(config, parameters);
        config.setCamelContext(getCamelContext());

        return new DigitalSignatureEndpoint(uri, this, config);
    }

    public DigitalSignatureConfiguration getConfiguration() {
        if (configuration == null) {
            configuration = new DigitalSignatureConfiguration();
        }
        return configuration;
    }

    public void setConfiguration(DigitalSignatureConfiguration configuration) {
        this.configuration = configuration;
    }
}
