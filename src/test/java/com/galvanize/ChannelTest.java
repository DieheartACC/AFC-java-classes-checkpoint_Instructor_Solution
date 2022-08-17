package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChannelTest {

    @Test
    public void channelHasCorrectPropertiesWhenInstantiated() {
        //setup
        Channel testChannel = new Channel(1, "HBO");
        //assertion
        assertEquals(1, testChannel.getNumber());
        assertEquals("HBO", testChannel.getName());

    }



}
