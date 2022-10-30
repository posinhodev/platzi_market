package com.platzi.market.domain.repository;

import com.platzi.market.domain.Purchase;

import java.util.*;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);

}
