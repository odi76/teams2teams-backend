package com.teams2teams.backend.loginapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.teams2teams.backend.openapi.api.PingApiDelegate;
import com.teams2teams.backend.openapi.model.Pong;

@Service
public class PingApiDelegateImpl implements PingApiDelegate {

    @Override
    public ResponseEntity<Pong> ping() {

        Pong pong = new Pong();
        pong.setPong("pong");
        return ResponseEntity.ok(pong);

    }



}
