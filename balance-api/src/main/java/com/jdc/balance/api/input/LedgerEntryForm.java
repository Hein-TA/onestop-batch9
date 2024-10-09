package com.jdc.balance.api.input;

import com.jdc.balance.model.entity.LedgerAccount.LedgerType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;

public record LedgerEntryForm(
        @NotNull(message = "Please enter ledger type.") LedgerType type,
        @NotNull(message = "Please enter issue at.") LocalDate issueAt,
        @NotEmpty(message = "Please enter ledger code.") String ledgerCode,
        String particular,
        List<@Valid LedgerEntryFormItem> items) {
}
