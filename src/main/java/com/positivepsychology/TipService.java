package com.positivepsychology;

import org.springframework.stereotype.Service;

@Service
public class TipService {
	
	public Tip fetchTip() throws InterruptedException {
		return Tip.values()[0];
	}

}
