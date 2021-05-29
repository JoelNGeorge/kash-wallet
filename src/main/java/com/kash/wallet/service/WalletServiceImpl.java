package com.kash.wallet.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kash.wallet.model.Wallet;
import com.kash.wallet.model.WalletType;

@Service
public class WalletServiceImpl implements WalletService {

	@Override
	public List<Wallet> findAllWallets() {
		List<Wallet> wallets = new ArrayList<Wallet>();

		// TODO: Hard-coded.. change!
		Wallet wallet = new Wallet();
		wallet.setId("1");
		wallet.setName("HDFC Bank");
		wallet.setDescription("HDFC Bank Savings Account");
		wallet.setBalanceAmount(new BigDecimal(0.00));
		wallet.setType(WalletType.BANK_ACCOUNT);
		wallets.add(wallet);

		Wallet wallet2 = new Wallet();
		wallet2.setId("2");
		wallet2.setName("Purse");
		wallet2.setDescription("Cash in hand");
		wallet2.setBalanceAmount(new BigDecimal(2500.00));
		wallet2.setType(WalletType.PURSE);
		wallets.add(wallet2);

		// End----

		return wallets;
	}

	@Override
	public Wallet findWalletById(String id) {
		// TODO: Hard-coded.. change!
		Wallet wallet = new Wallet();
		wallet.setId("1");
		wallet.setName("HDFC Bank");
		wallet.setDescription("HDFC Bank Savings Account");
		wallet.setBalanceAmount(new BigDecimal(0.00));
		wallet.setType(WalletType.BANK_ACCOUNT);
		// ---- End
		return wallet;

	}

}
