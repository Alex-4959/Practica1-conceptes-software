package org.udg.caes.banking.test;
import org.junit.jupiter.api.Test;
import org.udg.caes.banking.entity.CreditCard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TestCreditCard {
    @Test
    void testCredit(){
        CreditCard cc = new CreditCard("test");
        cc.credit(100);
        assertEquals(100, cc.getCredit());
        //Metodes a testejar per aquesta classe
        cc.reset();
        cc.getCredit();
        cc.getMaxCredit();
        cc.setActive(true);
    }
    @Test
    void testId(){
        CreditCard ce = new CreditCard("bank");
        assertEquals("bank", ce.getId());
    }
    @Test
    void testActive(){
        CreditCard  co = new CreditCard("test2");
        co.setActive(false);
        co.credit(200);
        co.credit(1000);
        assertEquals(0, co.getMaxCredit());
    }

    void testReset(){

    }
}
