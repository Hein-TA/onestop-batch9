package com.jdc.balance.api.input;

import com.jdc.balance.model.entity.LedgerAccount.LedgerType;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;

public record LedgerEntrySearch(
        @PathVariable("type") LedgerType type,
        LocalDate from,
        LocalDate to,
        String ledger) {
}
