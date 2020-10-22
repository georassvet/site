package ru.fishbalka.sport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.fishbalka.sport.forms.ProductForm;
import ru.fishbalka.sport.models.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    private List<Product> products = new ArrayList<>();

    @RequestMapping(value = {"/","/index"})
    public String index(Model model){
        model.addAttribute("products", products);
        model.addAttribute("ProductForm", new ProductForm());
        return "index";
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public String addProduct(Model model, ProductForm productForm){
        Product product = new Product(productForm);
        products.add(product);
        return "redirect:/";
    }

}
