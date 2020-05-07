package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.TeamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamDao teamDao;

    //전체 팀 조회하기 기능 구현
    public String viewAllTeams() {
        //DB에 접속해서 데이터를 select 해온다. 원래는 DB접속은 DAO 에서만 할수 있다. 그래서 위임해준다
        return teamDao.selectAllTeams();
    }
}
