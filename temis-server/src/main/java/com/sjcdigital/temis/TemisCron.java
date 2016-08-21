/**
 *
 */
package com.sjcdigital.temis;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sjcdigital.temis.model.service.bots.BotService;

/**
 * @author pedro-hos
 * 		Executa todo mês, no dia 01, a busca por novas leis
 *
 */
@Component
public class TemisCron {

	private BotService service;

	@Scheduled(cron = "0 0 0 1 * ?")
	public void run() {
		service.run();
	}

}
