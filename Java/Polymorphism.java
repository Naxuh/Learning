public class Polymorphism {
    public static void main(String[] args)
    {
        // Create objects of the child classes
        Person engineer = new Engineer("Alice");
        Person doctor = new Doctor("Bob");
        Person teacher = new Teacher("Charlie");

        // Call the do_job method on each object
        engineer.do_job();
        doctor.do_job();
        teacher.do_job();
    }

    // Parent class
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    
        void do_job() {
            System.out.println(name + " is working...");
        }
    }

    // Child class
    static class Engineer extends Person {
        Engineer(String name) {
            super(name);
        }

        @Override
        void do_job() {
            System.out.println(name + " is engineering...");
        }
    }

    // Child class
    static class Doctor extends Person {
        Doctor(String name) {
            super(name);
        }

        @Override
        void do_job() {
            System.out.println(name + " is healing people...");
        }
    }

    // Child class
    static class Teacher extends Person {
        Teacher(String name) {
            super(name);
        }

        @Override
        void do_job() {
            System.out.println(name + " is teaching students...");
        }
    }
}