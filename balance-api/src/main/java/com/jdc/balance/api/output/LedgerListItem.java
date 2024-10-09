package com.jdc.balance.api.output;

import com.jdc.balance.model.entity.LedgerAccount.LedgerType;

public record LedgerListItem(
        String code,
        String accountName,
        LedgerType type,
        long total) {

    public long getCreditTotal() {
        return type == LedgerType.Credit ? total : 0;
    }

    public long getDebitTotal() {
        return type == LedgerType.Debit ? total : 0;
    }
}
