package com.positivepsychology;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CacheService {
	
	private static List<Tip> tips;
	private static int currentTipIndex;
	private CacheThread cleanerThread;
	
	public CacheService() throws InterruptedException {
		cleanerThread = new CacheThread();
		cleanerThread.start();
	}
	
	public synchronized static Tip getTip() {
		return tips.get(currentTipIndex);
	}
	
	class CacheThread extends Thread {
		@Override
		public void run() {
			tips = Arrays.asList(Tip.values());
			while(true) {
				try {
					Thread.sleep(1000 * 60 * 60 * 4);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(currentTipIndex >= tips.size() - 1) {
					currentTipIndex = 0;
				} else {
					currentTipIndex++;
				}
			}
		}
	}

}
