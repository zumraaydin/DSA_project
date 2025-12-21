
    public class Task1Main {
        public static void main(String[] args) {
            PatientList list = new PatientList();  // I created list and
// I added 5 person info
            list.addPatient(new Patient("zümra", 20, 230444078, 2));
            list.addPatient(new Patient("birce ", 20,240444022,4));
            list.addPatient(new Patient("begüm", 21 ,230444049,6));
            list.addPatient(new Patient("arda", 23 , 230441054, 9));
            list.addPatient(new Patient("sena ",  22, 230444014, 7));
            System.out.println("liist");

            list.printList();


            list.removePatient(230444014);
            System.out.println("removed 230444014");

            list.findPatient(230444078);
            System.out.println("finded230444078");

            System.out.println("there is last print");
            list.printList();


        }
    }

