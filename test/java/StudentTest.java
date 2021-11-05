import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student s, s1;
    private Module m, m1;
    private CourseProgramme cp;

    @BeforeEach
    void setUp()
    {
        s = new Student("JohnDoe", "06-02-87", 34, 21347030);
        s1 = new Student("JudyDench","04-12-04", 17, 21548733);
        m = new Module("EE451", "System on Chip Design I");
        m1 = new Module("EE347", "Embedded Systems Applications Programming");
        cp = new CourseProgramme("BP1", new DateTime("2021-01-01T00:00:00Z"),
                new DateTime("2025-01-01T00:00:00Z"));
    }

    @Test
    public void test_username()
    {
        String expected = "JohnDoe34";
        String username = s.getUsername();
        assertEquals(expected, username);
    }

    @Test
    public void test_Students()
    {
        s.setCrseProg(cp);
        s.addModule(m);
        s.addModule(m1);
        s.removeModule(m1);
        String expected = "EE451\n";
        String id = s.getModuleIds();
        assertEquals(expected, id);
    }

    @Test
    public void test_Modules()
    {
        s.setCrseProg(cp);
        s1.setCrseProg(cp);
        m.addStudent(s);
        m.addStudent(s1);
        m.removeStudent(s);
        String expected = "[JudyDench17, 21548733, BP1\nEE451\n\n]";
        String students = m.getStudents().toString();
        assertEquals(expected, students);
    }

    @Test
    public void test_CrseProgramme()
    {
        s.setCrseProg(cp);
        s1.setCrseProg(cp);
        m.addStudent(s);
        m.addStudent(s1);
        m1.addStudent(s);
        cp.addModule(m);
        cp.addModule(m1);
        cp.removeModule(m);
        String expected = "BP1, Start Date = 2021-01-01T00:00:00.000Z, End Date = 2025-01-01T00:00:00.000Z\n" +
                "[EE347, Embedded Systems Applications Programming\n]\n[JohnDoe34, 21347030, BP1\nEE451\nEE347\n\n]";
        String crseProgramme = cp.toString();
        assertEquals(expected, crseProgramme);
    }
}