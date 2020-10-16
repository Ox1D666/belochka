package ru.cleverence.acceptance.store;

import ru.cleverence.acceptance.model.Product;

import java.util.Collection;

public interface Store {

    Collection<Product> findAll();

    void save(Product product);

    Product findById(int id);
}
