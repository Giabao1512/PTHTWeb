/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.nmgb.giabao;

import com.nmgb.pojo.Category;
import com.nmgb.repository.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class Giabao {

    public static void main(String[] args) {
        ProductRepositoryImpl a = new ProductRepositoryImpl();
        
        
        Map<String, String> params = new HashMap<>();
//        params.put("fromPrice", "18000000");
//        params.put("toPrice", "21000000");
//          params.put("cateID", "1");
          params.put("kw", "Iphone");
        
        a.getProducts(params).forEach(c -> System.err.printf("%d - %s - %.1f - %s\n", c.getId(), c.getName(), c.getPrice(), c.getCategory().getName()));

//            Query q = s.createQuery("From Category");
//            List<Category> cates = q.getResultList();
//            
//            cates.forEach(c -> System.out.println(c.getName()));
    }
}
