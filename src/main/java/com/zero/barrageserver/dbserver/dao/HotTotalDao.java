package com.zero.barrageserver.dbserver.dao;

import com.zero.barrageserver.dbserver.model.HotTotalTable;
import com.zero.barrageserver.dbserver.repository.HotTotalRepository;
import com.zero.barrageserver.dbserver.model.HotTotalTable;
import com.zero.barrageserver.dbserver.repository.HotTotalRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zero大神 on 2017/12/18.
 */
@Component
@Log4j2
public class HotTotalDao {
    @Autowired
    private HotTotalRepository hotTotalRepository;

    public List<HotTotalTable> getHotsByActivityId(String activityId){
        return hotTotalRepository.findAllByActivityIdOrderByTeamCodeAsc(activityId);
    }
}
