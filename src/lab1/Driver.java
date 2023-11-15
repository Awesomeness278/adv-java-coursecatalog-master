package lab1;

public class Driver {
    public static void main(String[] args) {
        ProgrammingCourse advJava = new AdvancedJavaCourse("Test","P301");
        advJava.setCredits(3);
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java","P201");
        introJava.setCredits(1);
        IntroToProgrammingCourse introProg = new IntroToProgrammingCourse("Intro to Programming","P101");
        introProg.setCredits(0.5);
        /*
        * This is really easy to expand upon and add to, I really like it
        * It feels very versatile to work with
        *
        * As for the type defining, using the abstract class is beneficial when you don't know which type of course will be assigned to that variable.
        * If, however, you know for sure which type of class is being assigned there, it would probably be best to use that class to define to both increase code functionality and to gain access to any new methods that the child class added.
        * */
    }
}
