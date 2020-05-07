package kr.re.kitri.hello.dao;

import org.springframework.stereotype.Repository;

@Repository //스프링에서 dao 를 지정
public class TeamDao {

    //team 테이블에 접근해서 select 해오는 코드
    //select * from teams;
    public String selectAllTeams() {

        return "전체 팀을 조회해서 리턴합니다.";
    }
}
