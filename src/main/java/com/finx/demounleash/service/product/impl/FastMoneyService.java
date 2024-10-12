package com.finx.demounleash.service.product.impl;

import com.finx.demounleash.service.product.ProductService;
import io.getunleash.UnleashContext;
import org.springframework.stereotype.Service;

@Service("fastMoneyService")
public class FastMoneyService implements ProductService {
    @Override
    public String checkEligibility(UnleashContext unleashContext) {
        return "eligible for register fast money";
    }
}
