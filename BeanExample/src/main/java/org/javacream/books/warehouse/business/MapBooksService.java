package org.javacream.books.warehouse.business;

import org.javacream.keygeneration.KeyGenerator;
import org.javacream.store.test.StoreServiceDummy;

public class MapBooksService {

    private KeyGenerator keyGenerator;
    private StoreServiceDummy storeService;

    public KeyGenerator getKeyGenerator() {
        return keyGenerator;
    }

    public void setKeyGenerator(KeyGenerator keyGenerator) {
        this.keyGenerator = keyGenerator;
    }

    public StoreServiceDummy getStoreService() {
        return storeService;
    }

    public void setStoreService(StoreServiceDummy storeService) {
        this.storeService = storeService;
    }
}
