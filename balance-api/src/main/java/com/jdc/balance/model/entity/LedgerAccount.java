package com.jdc.balance.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class LedgerAccount extends AbstractEntry {

	@Id
	private String code;

	@ManyToOne(optional = false)
	@JoinColumn(name = "account_id")
	private Account account;

	@Column(nullable = false)
	private String ledger;

	@Column(nullable = false)
	private LedgerType type;

	@OneToMany(mappedBy = "ledger")
	private List<LedgerEntry> entry;

	public enum LedgerType {
		Debit,
		Credit
	}

}