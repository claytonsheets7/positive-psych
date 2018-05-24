package com.positivepsychology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PositivePsychologyController {
	
	private final TipService tipService;
	private final CacheService cacheService;
	
	@Autowired
	public PositivePsychologyController(TipService tipService, CacheService cacheService) {
		this.tipService = tipService;
		this.cacheService = cacheService;
	}
	
	@GetMapping("/tip")
	public Tip getTip() throws InterruptedException {
		return CacheService.getTip();
	}
	
}
