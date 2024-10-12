package com.finx.demounleash.api;

import com.finx.demounleash.service.product.ProductService;
import io.getunleash.Unleash;
import io.getunleash.UnleashContext;
import io.getunleash.Variant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    @Qualifier("defaultProductService")
    private ProductService productService;
    @Autowired
    private Unleash unleash;

    @GetMapping
    String checkEligiblity(@RequestParam String userType, @RequestParam String userId) {
        UnleashContext context = UnleashContext.builder()
                .userId(userId)
                .addProperty("userType", userType)
                .build();

//        if (unleash.isEnabled("lendingProductFlag", context)) {
//            System.out.println("lendingProductFlag is enabled");
//            Variant variant = unleash.getVariant("lendingProductFlag", context);
//            System.out.println("variant" + variant.getName()+ ", payload: " + variant.getPayload());
//        }

        return productService.checkEligibility(context);
    }
}
