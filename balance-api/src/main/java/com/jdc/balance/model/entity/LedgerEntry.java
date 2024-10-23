package com.jdc.balance.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class LedgerEntry extends AbstractEntry {

	@EmbeddedId
	private LedgerEntryPk id;

	@ManyToOne(optional = false)
	private LedgerAccount ledger;

	@Column(nullable = false)
	private LocalDate issueAt;

	private String particular;

	@Column(nullable = false)
	private BigDecimal lastBalance;

	@Column(nullable = false)
	private BigDecimal totalAmount;

	@OneToMany(mappedBy = "entry")
	private List<LedgerEntryItem> items;

}