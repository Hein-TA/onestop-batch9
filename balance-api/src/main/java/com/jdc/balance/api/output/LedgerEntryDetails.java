package com.jdc.balance.api.output;

import com.jdc.balance.model.entity.LedgerAccount.LedgerType;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public record LedgerEntryDetails(
        String trxId,
        LedgerType type,
        String ledgerCode,
        String accountName,
        String particular,
        LocalDate issueAt,
        LocalDateTime entryAt,
        int total,
        List<LedgerEntryDetailsItem> items) {
}