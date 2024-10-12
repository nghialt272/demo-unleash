package com.finx.demounleash.service.product.impl;

import com.finx.demounleash.service.product.ProductService;
import io.getunleash.UnleashContext;
import org.springframework.stereotype.Service;

@Service("overDraftService")
public class OverDraftService implements ProductService {
    @Override
    public String checkEligibility(UnleashContext unleashContext) {
        return "eligible for register over draft";
    }
}
