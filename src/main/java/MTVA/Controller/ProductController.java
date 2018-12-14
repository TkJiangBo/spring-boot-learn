package MTVA.Controller;

import MTVA.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    ProductService productService;

    @RequestMapping("/code/{code}")
    public Object findById(@PathVariable String code) {
        return productService.findByCode(code);
    }

}
