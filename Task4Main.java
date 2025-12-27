
    public class Task4Main {

            public static void main(String[] args) {
                HospitalSystem line4 = new HospitalSystem();


                //adding patients
                line4.addPatient(new Patient("Berra",81,5,5));
                line4.addPatient(new Patient("Buse",90,9,3));
                line4.addPatient(new Patient("Züheyla",33,10,1));
                line4.addPatient(new Patient("Birceakalay",41,11,4));
                line4.addPatient(new Patient("Cerennaz",40,12,7));
                line4.addPatient(new Patient("Hayri",22,13,4));
                line4.addPatient(new Patient("Murat",15,14,8));
                line4.addPatient(new Patient("ArdaCan",22,15,9));
                line4.addPatient(new Patient("Furkan",21,16,7));
                line4.addPatient(new Patient("Serra",20,17,9));


                //adding normal
                //adding normal
                line4.addTreatmentRequest(14,false);
                line4.addTreatmentRequest(15,false);
                line4.addTreatmentRequest(16,false);
                line4.addTreatmentRequest(12,false);
                line4.addTreatmentRequest(13,false);


                //adding priority
                line4.addTreatmentRequest(9,true);
                line4.addTreatmentRequest(10,true);
                line4.addTreatmentRequest(11,true);


                //adding discharge
                line4.addDischargeRecord(5);
                line4.addDischargeRecord(9);


                //process treatment
                line4.processTreatmentRequest();
                line4.processTreatmentRequest();


                //sorting by severity
                line4.sortPatientsBySeverityDesc();


                //print final state
                line4.printSystemState();
            }


        }

       /* public static void main(String[] args) {

            HospitalSystem system = new HospitalSystem();

            // 10 hasta
            for (int i = 1; i <= 10; i++) {
                system.addPatient(
                        new Patient("",  2, i % 10 + 1, 20 + i)
                );
            }

            // 5 normal, 3 priority
            system.addTreatmentRequest(230444078, false);
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
        } */



