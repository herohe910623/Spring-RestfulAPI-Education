package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.jar.Attributes;

@RestController
public class HomeController {

    @Autowired //사용하겠다.
    private TeamService teamservice;

    @GetMapping("/hello")//endpoint에 해당된다. http://localhost:8080/hello
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/hello/hello2/hi/good")
    public String hello2() {
        return "안녕하세요";
    }

    @GetMapping(value="/teams",
            produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE}
    )//팀 목록보기
    public String getAllTeams() {
        //파라미터나 인증 정보 이런것들이 있으면 이걸 처리해주는 역할
        //기능을 수행.. (전체 팀 조회).. 비지니스레이어로 위임
        //전체팀 조회한 데이터를 받는다. from 비지니스 레이어에서

        return teamservice.viewAllTeams();
    }

    //
    @GetMapping("/investors/{investorId}/stocks/{stockId}")
    public String investorDetail(@PathVariable String investorId,
                                 @PathVariable String stockId) {
        return investorId + "번 고객님"+ stockId + " 정보입니다.";
    }
}
