package ui;

public class UIDoctorMenu {

    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome" + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");


        }while ( response !=0);
    }
}
