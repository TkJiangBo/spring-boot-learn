package MTVA.learn.demo;

import MTVA.Service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootLearnApplicationTests {

    @Autowired
    ProductService productService;

    @Test
    public void cacheTest() {
        productService.findByCode("500300000011");
        productService.findByCode("500300000011");
        productService.findByCode("500300000011");
    }

}

