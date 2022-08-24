import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Jhoan Gutierrez", "jhoan@email.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Jhoan", "Jhoan@email.com");
        user.showDataUser();

        User userPa = new Patient("Camilo", "Camilo@email.com");
        user.showDataUser();

        User user1 = new User( "Camilo", "camilo@email.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Uno");
                System.out.println("Departamento: Pediatría");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        /*for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());

        }*/

        /*System.out.println();
        System.out.println();
        Patient patient = new Patient("Camilo Velasquez", "camilo@gmail.com");
        System.out.println(patient);*/

    }
}
