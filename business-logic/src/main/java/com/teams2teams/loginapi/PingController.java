package com.teams2teams.loginapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.teams2teams.openapi.api.PingApi;
import com.teams2teams.openapi.model.Pong;

@RestController
public class PingController implements PingApi {

	public ResponseEntity<Pong> ping() {

		Pong pong = new Pong();
		pong.setPong("pong");
		return ResponseEntity.ok(pong);
		
	}
}
