package com.ohgiraffers.section02.annotation.subsection03;

import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("poketmonServiceCollection")
public class PoketmonService {

    @Autowired
    private List<Poketmon> poketmonList;

    public void poketmonAttack() {
        for (Poketmon poketmon : poketmonList) {
            poketmon.attack();
        }
    }
}
