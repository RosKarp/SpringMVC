package springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/add")
public class AddProductController {
    private ProductRepository productRepository;
    @Autowired
    public void setProductRepository (ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String getForm(Model uiModel){
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "addProduct";
    }
    @PostMapping( "/")
    public String addProduct (@ModelAttribute Product product, Model uiModel){
        uiModel.addAttribute("product", product);
    return "addResult";

    }
}
