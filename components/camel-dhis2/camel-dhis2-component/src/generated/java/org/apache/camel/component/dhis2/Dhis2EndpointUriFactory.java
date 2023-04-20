/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dhis2;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class Dhis2EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":methodName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(39);
        props.add("apiName");
        props.add("backoffErrorThreshold");
        props.add("backoffIdleThreshold");
        props.add("backoffMultiplier");
        props.add("baseApiUrl");
        props.add("bridgeErrorHandler");
        props.add("client");
        props.add("delay");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("fields");
        props.add("filter");
        props.add("greedy");
        props.add("inBody");
        props.add("initialDelay");
        props.add("interval");
        props.add("itemType");
        props.add("lastYears");
        props.add("lazyStartProducer");
        props.add("methodName");
        props.add("paging");
        props.add("password");
        props.add("path");
        props.add("pollStrategy");
        props.add("queryParams");
        props.add("repeatCount");
        props.add("resource");
        props.add("rootJunction");
        props.add("runLoggingLevel");
        props.add("scheduledExecutorService");
        props.add("scheduler");
        props.add("schedulerProperties");
        props.add("sendEmptyMessageWhenIdle");
        props.add("skipAggregate");
        props.add("skipEvents");
        props.add("startScheduler");
        props.add("timeUnit");
        props.add("useFixedDelay");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("password");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "dhis2".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "methodName", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

