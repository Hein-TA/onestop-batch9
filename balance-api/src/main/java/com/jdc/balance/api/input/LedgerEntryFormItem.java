package com.jdc.balance.api.input;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public record LedgerEntryFormItem(
        @NotEmpty(message = "Please enter item's information.") String itemInfo,
        @Min(value = 1000, message = "Please enter unit price.") int unitPrice,
        @Min(value = 1, message = "Please enter quantity.") int quantity) {
}
