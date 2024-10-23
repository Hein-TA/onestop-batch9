package com.jdc.balance.model.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class LedgerEntrySeqPk {

	private String accountId;

	private LocalDate entryDate;

	public static LedgerEntrySeqPk now(String accountId) {
		return new LedgerEntrySeqPk(accountId, LocalDate.now());
	}
}