package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s;
    @BeforeEach
    void init(){
        s = new Student("6710405362", "SharkPong");
    }
    @Test
    void testAddScore(){
        Student s = new Student("6710405362","Sharkpong");
        s.addScore(99.99);
        assertEquals("A", s.grade());

    }
    @Test
    void testCalculateScore(){
        Student s = new Student("6710405362","Sharkpong");
        s.addScore(99.99);
        assertEquals("A", s.grade());
    }

    @Test
    void testChangeName() {
        s.changeName("SharkPenguin");
    }
}