package com.finx.demounleash.service.product.impl;

import com.finx.demounleash.service.product.ProductService;
import io.getunleash.UnleashContext;
import org.springframework.stereotype.Service;

@Service("defaultProductService")
public class DefaultProductService implements ProductService {
    @Override
    public String checkEligibility(UnleashContext unleashContext) {
        return "no available product";
    }
}
