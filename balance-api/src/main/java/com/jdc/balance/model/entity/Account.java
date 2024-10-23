package com.jdc.balance.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Entity
@Data
public class Account extends AbstractEntry {

	@Id
	private String email;

	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String role;

	private LocalDateTime entryAt;

	@OneToOne(mappedBy = "account", fetch = FetchType.LAZY)
	private AccountBalance balance;

	@OneToOne(mappedBy = "account", fetch = FetchType.LAZY)
	private AccountActivity activity;

	public enum Role {
		Admin,
		Member
	}

}