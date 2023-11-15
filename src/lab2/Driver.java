package lab2;

public class Driver {
    public static void main(String[] args) {
        ProgrammingCourse advJava = new AdvancedJavaCourse("Advanced Java","P301");
        advJava.getCourseName();
        advJava.setCredits(4);
        advJava.setCourseNumber("J301");
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java","P201");
        introJava.getCredits();
        introJava.setCredits(5);
        introJava.getCredits();
        IntroToProgrammingCourse introProgramming = new IntroToProgrammingCourse("Intro to Programming", "P101");
        introProgramming.setCredits(1);
        introProgramming.setCourseName("Intro Programming");
        /*
        * Doing this with interfaces felt a lot better than abstract methods
        * I don't know much why, the interface just feels cleaner than the abstract method
        * plus it gives more control to the implementation
        *
        * If you are going to be using methods that the implementations add to the interface, then substitution won't work because the interface doesn't have that method. However, all three classes have the exact same methods so that changes nothing for this project, and you should be able to substitute to your heart's content.
        * */
    }
}
