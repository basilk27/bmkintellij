package com.mbsystems.demogitintellij.controller;

import com.mbsystems.demogitintellij.domain.GitIntellij;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class GitIntellijController {

    @GetMapping("/user")
    public ResponseEntity<GitIntellij> getUser() {
        GitIntellij gitIntellij = GitIntellij.builder()
                                    .version( "1.8" )
                                    .code( "Java" )
                                    .location( "local" )
                                    .build();

        return new ResponseEntity<>( gitIntellij, HttpStatus.OK );
    }
}
