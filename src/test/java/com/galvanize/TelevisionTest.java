package com.galvanize;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TelevisionTest {

    Television newTv;

    @BeforeEach
    void init() {
        Channel hbo = new Channel(1, "HBO");
        Channel showtime = new Channel(2, "showtime");
        Channel abc = new Channel(3, "ABC");
        ArrayList<Channel> channels = new ArrayList<>(Arrays.asList(hbo, showtime, abc));
        newTv = new Television(channels);
    }



    @Test
    public void televisionCanBeCreatedWithListOfChannels() {
        //Assertion
        assertEquals("HBO", newTv.getChannels().get(0).getName());
    }


    @Test
    void televisionShouldDefaultToOff() {
        //Assertion

        assertEquals(false, newTv.isOn());
    }

    @Test
    void televisionShouldTurnOn() {
        //Execution
        newTv.turnOn();

        assertEquals(true, newTv.isOn());
    }

    @Test
    void televisionShouldTurnOffWhenMethodCalled() {
        //Execution
        newTv.turnOn();

        newTv.turnOff();

        assertEquals(false, newTv.isOn());

    }

    @Test
    void currentChannelReturnsFirstChannelAsDefault() {
        //assertion
        assertEquals("1 - HBO", newTv.currentChannel());

    }

    @Test
    void shouldBeAbleToIncreaseChannel() {
        //execution
        newTv.increaseChannel();


        assertEquals("2 - showtime", newTv.currentChannel());

        newTv.increaseChannel().increaseChannel().decreaseChannel();

        assertEquals("1 - HBO", newTv.currentChannel());
    }

    @Test
    void shouldBeAbleToDecreaseChannel() {
        newTv.decreaseChannel();

        assertEquals("3 - ABC", newTv.currentChannel());

        newTv.decreaseChannel();

        assertEquals("2 - showtime", newTv.currentChannel());
    }

    @Test
    void shouldBeAbleToToggleTv() {
        newTv.toggle();

        assertEquals(true, newTv.isOn());

        newTv.toggle();

        assertEquals(false, newTv.isOn());

    }

}
