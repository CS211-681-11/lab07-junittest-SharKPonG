package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    private StudentList studentList;

    @BeforeEach
    void init() {
        studentList = new StudentList();
    }

    @Test
    void testStudentByName() {
        studentList.addNewStudent("6710409999", "Sharkpong");
        assertFalse(studentList.filterByName("Sharkpong").getStudents().isEmpty());
        assertTrue(studentList.filterByName("pingpong").getStudents().isEmpty());
    }


    @Test
    void testFindStudentById() {
        studentList.addNewStudent("6710409999", "Sharkpong");
        assertNotNull(studentList.findStudentById("6710409999"));
        assertNull(studentList.findStudentById("6710409909"));
    }

    @Test
    void testViewGradeOfId() {
        studentList.addNewStudent("6710409999", "Sharkpong", 70);
        studentList.giveScoreToId("6710409999", 90);
        assertEquals("A", studentList.viewGradeOfId("6710409999"));
    }
}
