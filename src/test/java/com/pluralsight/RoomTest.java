package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void cleanRoom_should_setDirtyToFalse() {
        // arrange
        Room room = new Room(1, 139.00, false, true);
        // act
        room.cleanRoom();
        // assert
        boolean isActualDirty = room.isDirty();
        assertFalse(isActualDirty);
    }

    @Test
    void checkOut_should_setOccupiedToFalse() {
        // arrange
        Room room = new Room(1, 139.00, true, true);
        // act
        room.checkOut();
        // assert
        boolean isActualOccupied = room.isOccupied();
        assertFalse(isActualOccupied);
    }

    @Test
    void isAvailable_should_returnTrue_whenRoomIsCleanAndEmpty() {
        // arrange
        Room room = new Room(1, 139.00, false, false);
        // act
        boolean isActualAvailable = room.isAvailable();
        // assert
        assertTrue(isActualAvailable);
    }

    @Test
    void checkIn_should_setOccupiedAndDirtyToTrue_whenRoomIsAvailable() {
        // arrange
        Room room = new Room(1, 139.00, false, false);
        // act
        room.checkIn();
        // assert
        boolean isOccupied = room.isOccupied();
        boolean isDirty = room.isDirty();
        assertTrue(isOccupied);
        assertTrue(isDirty);
    }

    @Test
    void checkIn_shouldNotChangeRoom_whenAlreadyOccupied() {
        // arrange
        Room room = new Room(1, 139.00, true, false);
        // act
        room.checkIn();
        // assert
        boolean isOccupied = room.isOccupied();
        boolean isDirty = room.isDirty();
        assertTrue(isOccupied);
        assertFalse(isDirty);
    }

    @Test
    void checkIn_shouldNotChangeRoom_whenDirty() {
        // arrange
        Room room = new Room(1, 139.00, false, true);
        // act
        room.checkIn();
        // assert
        boolean isOccupied = room.isOccupied();
        boolean isDirty = room.isDirty();
        assertFalse(isOccupied);
        assertTrue(isDirty);
    }
}