package PeerProgramming;

import static PeerProgramming.DoggoCompetition.doggoCompetition;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DoggoTester {

    @Test
    void testPos6() {
        assertEquals(99, doggoCompetition(6).size());
    }

    @Test
    void testPos5() {
        assertFalse(doggoCompetition(5).contains("5th"));
    }

    @Test
    void testPos99() {
        assertTrue(doggoCompetition(99).contains("100th"));
    }

    @Test
    void testPos1() {
        assertFalse(doggoCompetition(1).contains("1st"));
    }
}
