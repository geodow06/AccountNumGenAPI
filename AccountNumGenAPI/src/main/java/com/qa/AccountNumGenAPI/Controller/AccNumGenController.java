package com.qa.AccountNumGenAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.AccountNumGenAPI.Service.AccNumGenService;

@RestController
public class AccNumGenController {
	
	private AccNumGenService svc;

	public AccNumGenService getAccNumGenService() {
		return svc;
	}

	public AccNumGenController(AccNumGenService svc) {
		this.svc = svc;

	}

	@GetMapping("/getAccNum")
	public String getAccNum() {
		return svc.generateNumber();
	}

	@Override
	public String toString() {
		return "AccNumGenController [svc=" + svc + "]";
	}
}
