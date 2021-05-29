package com.kash.wallet.model;

public enum WalletType {

	BANK_ACCOUNT("Bank"), 
	PURSE("Purse");

	private final String typeName;

	private WalletType(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeName() {
		return typeName;
	}

}
