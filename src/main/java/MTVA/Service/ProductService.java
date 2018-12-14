package MTVA.Service;

import MTVA.Entity.Product;

public interface ProductService {
    public Product findByCode(String code);
}
