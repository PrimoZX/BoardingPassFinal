import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Boarding_Pass_InfoTest {

    Boarding_Pass_Info bpi;

    @BeforeEach
    void setUp() {
        bpi = new Boarding_Pass_Info();
    }

    @Test
    void getName() {
        assertEquals(null, bpi.getName());
    }

    @Test
    void setName() {
        bpi.setName("James");
        assertEquals("James", bpi.getName(), "setName Test Failed");
    }

    @Test
    void getEmail() {
        assertEquals(null, bpi.getEmail());
    }

    @Test
    void setEmail() {
        bpi.setEmail("null@email.com");
        assertEquals("null@email.com", bpi.getEmail(), "setEmail Test Failed");
    }

    @Test
    void getPhoneNumber() {
        assertEquals(null, bpi.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        bpi.setPhoneNumber("000-000-0000");
        assertEquals("000-000-0000", bpi.getPhoneNumber(), "setPhoneNumber Test Failed");
    }

    @Test
    void getGender() {
        assertEquals(null, bpi.getGender());
    }

    @Test
    void setGender() {
        bpi.setGender("M/F");
        assertEquals("M/F", bpi.getGender(),"setGender Test Failed");
    }

    @Test
    void getAge() {
        assertEquals(0, bpi.getAge());
    }

    @Test
    void setAge() {
        bpi.setAge(0);
        assertEquals(0, bpi.getAge(), "setAge Test Failed");
    }

    @Test
    void getDate() {
        assertEquals(null, bpi.getDate());
    }

    @Test
    void setDate() {
        bpi.setDate("00/00/00");
        assertEquals("00/00/00", bpi.getDate(), "SetDate Test Failed");
    }

    @Test
    void getOrigin() {
        assertEquals(null, bpi.getOrigin());
    }

    @Test
    void setOrigin() {
        bpi.setOrigin("Origin Location");
        assertEquals("Origin Location", bpi.getOrigin(), "setOrigin Test Failed");
    }

    @Test
    void getDestination() {
        assertEquals(null, bpi.getDestination());
    }

    @Test
    void setDestination() {
        bpi.setDestination("Destination Location");
        assertEquals("Destination Location", bpi.getDestination(), "setDestination Test Failed");
    }

    @Test
    void getDepartureTime() {
        assertEquals(null, bpi.getDepartureTime());
    }

    @Test
    void setDepartureTime() {
        bpi.setDepartureTime("00:00");
        assertEquals("00:00", bpi.getDepartureTime(), "setDepartureTime Test Failed");
    }

    @Test
    void getBoardingPassNumber() {
        assertEquals(null, bpi.getBoardingPassNumber());
    }

    @Test
    void setBoardingPassNumber() {
        bpi.setBoardingPassNumber("00000");
        assertEquals("00000", bpi.getBoardingPassNumber(), "setBoardingPassNumber Test Failed");
    }

    @AfterEach
    void tearDown() {
    }
}