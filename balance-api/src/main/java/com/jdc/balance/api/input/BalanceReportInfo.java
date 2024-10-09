package com.jdc.balance.api.input;

import com.jdc.balance.model.entity.LedgerAccount;
import com.jdc.balance.model.entity.LedgerAccount.LedgerType;

import java.time.LocalDate;

public record BalanceReportInfo(
        LocalDate issueAt,
        String ledgerCode,
        String ledgerAccountName,
        String particular,
        LedgerType type,
        int amount,
        int balance) {
}
