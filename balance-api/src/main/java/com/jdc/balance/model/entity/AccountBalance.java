package com.jdc.balance.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class AccountBalance extends AbstractEntry {

	@Id
	private String accountId;

	@OneToOne(optional = false)
	@MapsId("accountId")
	private Account account;

	private BigDecimal amount;

}