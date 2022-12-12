package springcourse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping("/all")
public class AllProductsController {

        private ProductRepository productRepository;
        @Autowired
        public void setProductRepository (ProductRepository productRepository) {
            this.productRepository = productRepository;
        }
        @GetMapping(value = "/")
        public String showAllAuthors(Model uiModel){
            List<Product> products = productRepository.getProducts();
            uiModel.addAttribute("products", products);
            return "allProducts";
        }
    }