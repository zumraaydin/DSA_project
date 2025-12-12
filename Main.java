//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PatientList list = new PatientList();  // I created list and
// I added 5 person info
        list.addPatient(new Patient("zümra", 20, 230444078, 2));
        list.addPatient(new Patient("birce ", 20,240444022,4));
        list.addPatient(new Patient("begüm", 21 ,230444049,6));
        list.addPatient(new Patient("arda", 23 , 230441054, 9));
        list.addPatient(new Patient("sena ",  22, 230444014, 7));
        System.out.println("line");

        list.printList();
        list.removePatient(3);
        list.findPatient(2);
        list.printList();


        }
    }
