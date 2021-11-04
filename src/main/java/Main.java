import org.joda.time.DateTime;

public class Main
{
    public static void main(String[] args)
    {
        Student s = new Student("LiamHand", "11-07-90", 31, 18732876);
        Student s1 = new Student("RogerPerdue", "21-04-00", 21, 21337483);
        Student s2 = new Student("SusanWilliams", "06-01-03", 18, 21328833);
        Student s3 = new Student("HannahGaughan", "26-03-03", 18, 21982838);
        Student s4 = new Student("MattGetfrie", "18-05-03", 18, 21619347);

        Module m = new Module("EE451", "System on Chip Design I");
        Module m1 = new Module("EE452", "System on Chip Design II");
        Module m2 = new Module("CT417", "Software Engineering III");
        Module m3 = new Module("EE347", "Embedded Systems Applications Programming");
        Module m4 = new Module("EE4101", "Mobile Networks: Architecture and Services");
        Module m5 = new Module("EE445", "Digital Signal Processing");

        m.addStudent(s);
        m.addStudent(s1);
        m.addStudent(s2);
        m.addStudent(s3);
        m.addStudent(s4);

        m1.addStudent(s);
        m1.addStudent(s1);
        m1.addStudent(s2);
        m1.addStudent(s3);
        m1.addStudent(s4);

        m2.addStudent(s);
        m2.addStudent(s1);
        m2.addStudent(s2);
        m2.addStudent(s3);
        m2.addStudent(s4);

        m3.addStudent(s);
        m3.addStudent(s1);
        m3.addStudent(s2);
        m3.addStudent(s3);
        m3.addStudent(s4);

        m4.addStudent(s);
        m4.addStudent(s1);
        m4.addStudent(s2);
        m4.addStudent(s3);
        m4.addStudent(s4);

        m5.addStudent(s);
        m5.addStudent(s1);
        m5.addStudent(s2);
        m5.addStudent(s3);
        m5.addStudent(s4);

        CourseProgramme cp = new CourseProgramme("BP1", new DateTime("2021-01-01T00:00:00Z"),
                new DateTime("2025-01-01T00:00:00Z"));

        s.setCrseProg(cp);
        s1.setCrseProg(cp);
        s2.setCrseProg(cp);
        s3.setCrseProg(cp);
        s4.setCrseProg(cp);
        
        cp.addModule(m);
        cp.addModule(m1);
        cp.addModule(m2);
        cp.addModule(m3);
        cp.addModule(m4);
        cp.addModule(m5);

        System.out.println(cp);
    }
}