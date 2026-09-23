package org.udg.caes.banking.test;
import org.junit.jupiter.api.Test;
import org.udg.caes.banking.entity.Account;
import org.udg.caes.banking.exceptions.NotEnoughBalance;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAccount {
    @Test
    void testAccount(){
        Account ac = new Account("test", 0);
        ac.credit(200);
        assertEquals(200, ac.getBalance());
    }
    @Test
    void testDebitWin() throws NotEnoughBalance {
        Account acc = new Account("test2", 175);
        acc.debit(75);

        assertEquals(100, acc.getBalance());
    }

    @Test
    void testDebitFail(){
        Account a = new Account("test3", 100);
        assertThrows(NotEnoughBalance.class, () -> {
            a.debit(200);
        });
    }

    @Test
    void testId(){
        Account ac = new Account("Hola", 0);
        assertEquals("Hola", ac.getId());
    }
}
