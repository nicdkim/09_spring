package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("poketmonServiceQualfier")
public class PoketmonService {

    @Autowired
    @Qualifier("pikachu")
    private Poketmon poketmon;

    public PoketmonService(Poketmon poketmon) {
        this.poketmon = poketmon;
    }

    public void poketmonAttack() {
        poketmon.attack();
    }
}
