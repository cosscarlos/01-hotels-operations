package com.pluralsight;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void checkIn_Should_MarkRoomAsOccupiedAndDirty(){
        //arrange what do i need
        Room room = new Room (1, 139.00, false, false);

        //act perform the test
        room.checkIn();

        //assert the result
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void CheckOut_Should_MarkRoomAsNotOccupiedAndDirty(){
        // arrange
        Room room = new Room (1, 139.00, true, true);

        //act
        room.checkOut();

        //assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());


    }

    @Test
    public void CleanRoom_Should_MarkRoomAsNotOccupiedAndNotDirty(){
        Room room = new Room (1, 139.00, false, true);

        room.cleanRoom();

        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
    }




    }



