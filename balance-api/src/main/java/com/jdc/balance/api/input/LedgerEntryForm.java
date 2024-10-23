package com.jdc.balance.api.input;

import com.jdc.balance.model.entity.LedgerAccount.LedgerType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;

public record LedgerEntryForm(
        @NotEmpty(message = "Please enter ledger code.") String ledgerCode,
        @NotNull(message = "Please enter issue at.") LocalDate issueAt,
        String particular,
        List<@Valid LedgerEntryFormItem> items) {
}
