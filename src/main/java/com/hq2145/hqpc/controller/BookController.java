package com.hq2145.hqpc.controller;

import com.hq2145.hqpc.entity.ProductCategory;
import com.hq2145.hqpc.repository.ProductCategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @GetMapping("/list")
    public @ResponseBody List<ProductCategory> get() {
        log.info("process=get-books");
        return productCategoryRepository.findAll();
    }

    @PutMapping("/save")
    public @ResponseBody String save(@RequestBody ProductCategory category) {
        log.info("process=save-category");
        productCategoryRepository.save(category);
        return "Saved A Category";
    }


}
