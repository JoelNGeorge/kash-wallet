package com.kash.wallet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kash.wallet.model.Wallet;

@Service
public interface WalletService {
	
	public List<Wallet> findAllWallets();
	public Wallet findWalletById(String id);

}
