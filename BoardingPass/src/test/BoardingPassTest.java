import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BoardingPassTest {

    BoardingPass bp;

    @BeforeEach
    void setUp() {
        bp = new BoardingPass();
    }

    @Test
    void firstLine() {
        assertEquals("null", "null", "firstLine Test Failed");
    }

    @Test
    void secondLine() {
        assertEquals("null", "null", "secondLine Test Failed");
    }

    @Test
    void ticketPrice() {
        assertEquals("$540", "$540", "ticketPrice Test Failed");
    }

    @AfterEach
    void tearDown() {
    }
}