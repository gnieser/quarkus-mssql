package org.acme.test;

import io.quarkus.test.junit.QuarkusTest;
import org.acme.MessageEntity;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class MessageTest {

    @Test
    void list() {
        List<MessageEntity> messages = MessageEntity.listAll();
        assertEquals(2, messages.size());
    }
}
