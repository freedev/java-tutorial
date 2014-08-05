package com.damore.effective.sample1;

import java.util.Map;
import java.util.HashMap;

/**
 * Non instantiable class for service registration and access
 * @author freedev
 *
 */
public class Services {

    private Services() {}

    private static Map<String, Provider> providers = new HashMap<>();

    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(Provider p) {
        providers.put(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    public static Service getService() {
        return getService(DEFAULT_PROVIDER_NAME);
    }

    public static Service getService(String providerName) {
        Provider p = providers.get(providerName);
        if (p == null) {
        	throw new IllegalArgumentException();
        }
        return p.getService();
    }
}
