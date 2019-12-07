package com.nare.controller;

import javax.xml.bind.ParseConversionEvent;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.nare.bean.CurrencyConversionBean;
import com.nare.bean.CurrencyEntity;

@RestController
public class CurrencyController {
	@GetMapping(value="/get/from/{from}/to/{to}/{value}")
	public CurrencyConversionBean conversion(@PathVariable("from")String from ,@PathVariable("to")String to,@PathVariable("value")String val) {
		
		String url="https://ceapp.cfapps.io/exchange/from/"+from+"/to/"+to;
		WebClient.Builder b=WebClient.builder();
		WebClient w=b.build();
		CurrencyEntity e=w.get()
				.uri(url)
				.retrieve()
				.bodyToMono(CurrencyEntity.class).block();
		int v=e.getValue()*(Integer.parseInt(val));
		CurrencyConversionBean cc=new CurrencyConversionBean();
		cc.setFrom(from);
		cc.setTo(to);
		cc.setV(v);
		return cc;
	}
	

}
