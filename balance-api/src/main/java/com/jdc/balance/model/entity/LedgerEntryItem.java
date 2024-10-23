package com.jdc.balance.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class LedgerEntryItem {

	@EmbeddedId
	private LedgerEntryItemPk id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "account_id", referencedColumnName = "account_id", insertable = false, updatable = false)
	@JoinColumn(name = "entry_date", referencedColumnName = "entry_date", insertable = false, updatable = false)
	@JoinColumn(name = "seq_number", referencedColumnName = "seq_number", insertable = false, updatable = false)
	private LedgerEntry entry;

	@Column(nullable = false)
	private String entryInfo;

	@Column(nullable = false)
	private BigDecimal unitPrice;

	@Column(nullable = false)
	private int quantity;

}