package MTVA.ServiceImpl;

import MTVA.Entity.Product;
import MTVA.Repository.ProductRepository;
import MTVA.Service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productDao;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    @Cacheable(cacheNames = "skuByCode",key = "#code")
    public Product findByCode(String code) {
        logger.info("查询sku:"+code);
        return productDao.findByProductNumber(code);
    }
}
