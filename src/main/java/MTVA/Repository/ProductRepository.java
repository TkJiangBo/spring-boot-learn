package MTVA.Repository;

import MTVA.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    public Product findByProductNumber(String productNumber);
}
