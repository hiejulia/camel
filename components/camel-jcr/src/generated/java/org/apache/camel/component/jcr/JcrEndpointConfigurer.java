/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jcr;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JcrEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "deep": ((JcrEndpoint) target).setDeep(property(camelContext, boolean.class, value)); return true;
        case "eventTypes": ((JcrEndpoint) target).setEventTypes(property(camelContext, int.class, value)); return true;
        case "nodeTypeNames": ((JcrEndpoint) target).setNodeTypeNames(property(camelContext, java.lang.String.class, value)); return true;
        case "noLocal": ((JcrEndpoint) target).setNoLocal(property(camelContext, boolean.class, value)); return true;
        case "password": ((JcrEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sessionLiveCheckInterval": ((JcrEndpoint) target).setSessionLiveCheckInterval(property(camelContext, long.class, value)); return true;
        case "sessionLiveCheckIntervalOnStart": ((JcrEndpoint) target).setSessionLiveCheckIntervalOnStart(property(camelContext, long.class, value)); return true;
        case "username": ((JcrEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "uuids": ((JcrEndpoint) target).setUuids(property(camelContext, java.lang.String.class, value)); return true;
        case "workspaceName": ((JcrEndpoint) target).setWorkspaceName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((JcrEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((JcrEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((JcrEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((JcrEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((JcrEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((JcrEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "deep": ((JcrEndpoint) target).setDeep(property(camelContext, boolean.class, value)); return true;
        case "eventtypes": ((JcrEndpoint) target).setEventTypes(property(camelContext, int.class, value)); return true;
        case "nodetypenames": ((JcrEndpoint) target).setNodeTypeNames(property(camelContext, java.lang.String.class, value)); return true;
        case "nolocal": ((JcrEndpoint) target).setNoLocal(property(camelContext, boolean.class, value)); return true;
        case "password": ((JcrEndpoint) target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sessionlivecheckinterval": ((JcrEndpoint) target).setSessionLiveCheckInterval(property(camelContext, long.class, value)); return true;
        case "sessionlivecheckintervalonstart": ((JcrEndpoint) target).setSessionLiveCheckIntervalOnStart(property(camelContext, long.class, value)); return true;
        case "username": ((JcrEndpoint) target).setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "uuids": ((JcrEndpoint) target).setUuids(property(camelContext, java.lang.String.class, value)); return true;
        case "workspacename": ((JcrEndpoint) target).setWorkspaceName(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((JcrEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((JcrEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((JcrEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((JcrEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((JcrEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((JcrEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
