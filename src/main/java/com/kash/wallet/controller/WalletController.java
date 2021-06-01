package com.kash.wallet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kash.wallet.model.Wallet;
import com.kash.wallet.service.WalletService;

@RestController
public class WalletController {
	
	@Autowired
	WalletService walletService;

	@GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Wallet> getWallets() {
		return walletService.findAllWallets();
	}

	@GetMapping(value = "/get/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Wallet getWallet(@PathVariable String id) {
		return walletService.findWalletById(id);
	}

}
