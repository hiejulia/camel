/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elasticsearch;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ElasticsearchComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ElasticsearchComponent target = (ElasticsearchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "client": target.setClient(property(camelContext, org.elasticsearch.client.RestClient.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "enablessl":
        case "enableSSL": target.setEnableSSL(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "enablesniffer":
        case "enableSniffer": target.setEnableSniffer(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "hostaddresses":
        case "hostAddresses": target.setHostAddresses(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxretrytimeout":
        case "maxRetryTimeout": target.setMaxRetryTimeout(property(camelContext, int.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sniffafterfailuredelay":
        case "sniffAfterFailureDelay": target.setSniffAfterFailureDelay(property(camelContext, int.class, value)); return true;
        case "snifferinterval":
        case "snifferInterval": target.setSnifferInterval(property(camelContext, int.class, value)); return true;
        case "sockettimeout":
        case "socketTimeout": target.setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "user": target.setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("client", org.elasticsearch.client.RestClient.class);
        answer.put("connectionTimeout", int.class);
        answer.put("enableSSL", java.lang.Boolean.class);
        answer.put("enableSniffer", java.lang.Boolean.class);
        answer.put("hostAddresses", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("maxRetryTimeout", int.class);
        answer.put("password", java.lang.String.class);
        answer.put("sniffAfterFailureDelay", int.class);
        answer.put("snifferInterval", int.class);
        answer.put("socketTimeout", int.class);
        answer.put("user", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ElasticsearchComponent target = (ElasticsearchComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "client": return target.getClient();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConnectionTimeout();
        case "enablessl":
        case "enableSSL": return target.getEnableSSL();
        case "enablesniffer":
        case "enableSniffer": return target.getEnableSniffer();
        case "hostaddresses":
        case "hostAddresses": return target.getHostAddresses();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxretrytimeout":
        case "maxRetryTimeout": return target.getMaxRetryTimeout();
        case "password": return target.getPassword();
        case "sniffafterfailuredelay":
        case "sniffAfterFailureDelay": return target.getSniffAfterFailureDelay();
        case "snifferinterval":
        case "snifferInterval": return target.getSnifferInterval();
        case "sockettimeout":
        case "socketTimeout": return target.getSocketTimeout();
        case "user": return target.getUser();
        default: return null;
        }
    }
}
