package com.finx.demounleash.service.product;

import io.getunleash.UnleashContext;
import org.unleash.features.annotation.FeatureVariant;
import org.unleash.features.annotation.FeatureVariants;
import org.unleash.features.annotation.Toggle;

public interface ProductService {
    @Toggle(name = "lendingProductFlag", variants =
            @FeatureVariants(
                    fallbackBean = "overDraftService",
                    variants = {
                            @FeatureVariant(name = "credit-card", variantBean = "creditCardService"),
                            @FeatureVariant(name = "fast-money", variantBean = "fastMoneyService"),
                            @FeatureVariant(name = "over-draft", variantBean = "overDraftService")
                    }))
    String checkEligibility(UnleashContext unleashContext);
}
