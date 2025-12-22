
    public class Task4Main {

        public static void main(String[] args) {

            HospitalSystem system = new HospitalSystem();

            // 10 hasta
            for (int i = 1; i <= 10; i++) {
                system.addPatient(
                        new Patient("",  2, i % 10 + 1, 20 + i)
                );
            }

            // 5 normal, 3 priority
            system.addTreatmentRequest(1, false);
            system.addTreatmentRequest(2, false);
            system.addTreatmentRequest(3, false);
            system.addTreatmentRequest(4, false);
            system.addTreatmentRequest(5, false);

            system.addTreatmentRequest(6, true);
            system.addTreatmentRequest(7, true);
            system.addTreatmentRequest(8, true);

            // 2 discharge
            system.processTreatment();
            system.processTreatment();

            // 4 treatment işle
            system.processTreatment();
            system.processTreatment();
            system.processTreatment();
            system.processTreatment();

            // Son durum
            system.printSystemState();
        }
    }


