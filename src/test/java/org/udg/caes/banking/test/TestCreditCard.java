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
    }

    void testReset(){

    }
}
