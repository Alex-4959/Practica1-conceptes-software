package org.udg.caes.banking.test;
import org.junit.jupiter.api.Test;
import org.udg.caes.banking.entity.Client;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClient {
    @Test
    void testClient(){
        Client cl = new Client("Alex");
        assertEquals("Alex",cl.getId());

    }
}
