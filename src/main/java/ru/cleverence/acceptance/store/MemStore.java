package ru.cleverence.acceptance.store;

import ru.cleverence.acceptance.model.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Local storage.
 */
public class MemStore implements Store {

    private static final Store INST = new MemStore();

    private Map<Integer, Product> products = new ConcurrentHashMap<>();

    private static AtomicInteger POST_ID = new AtomicInteger(4);

    public MemStore() {
        products.put(1, new Product(1, "belochka", 100, "vkus detstva"));
        products.put(2, new Product(2, "maska", 20, "toje nichego"));
        products.put(3, new Product(3, "barbaris", 50, "pod pivo poidet"));
    }

    @Override
    public Collection<Product> findAll() {
        return products.values();
    }

    @Override
    public void save(Product product) {
        product.setId(POST_ID.incrementAndGet());
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    public static Store instOf() {
        return INST;
    }
}
