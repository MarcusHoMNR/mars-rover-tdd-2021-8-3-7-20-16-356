package com.afs.tdd;

import com.afs.tdd.Objects.MarsRover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_direct_change_to_E_when_rotate_Mars_Rover_given_direction_N_and_command_R() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String command = "M";

        //when
        marsRover.rotateMarsRover(command);
        String result = marsRover.getStatus();

        //return
        assertEquals("0 1 N", result);
    }
}
