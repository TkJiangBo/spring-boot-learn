package MTVA.ServiceImpl;

import MTVA.Entity.Product;
import MTVA.Repository.ProductRepository;
import MTVA.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productDao;

    @Override
    public Product findByCode(String code) {
        return productDao.findByProductNumber(code);
    }
}
