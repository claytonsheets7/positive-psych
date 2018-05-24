package com.positivepsychology.service;

import org.springframework.stereotype.Service;

import com.positivepsychology.Tip;

@Service
public class TipService {
	
	public Tip fetchTip() throws InterruptedException {
		return Tip.values()[0];
	}

}
