package com.finx.demounleash.service.product.impl;

import com.finx.demounleash.service.product.ProductService;
import io.getunleash.UnleashContext;
import org.springframework.stereotype.Service;

@Service("creditCardService")
public class CreditCardService implements ProductService {
    @Override
    public String checkEligibility(UnleashContext unleashContext) {
        return "eligible for register credit card";
    }
}
