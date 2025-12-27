
import java.util.HashMap;



   /* public class HospitalSystem {

      private final  PatientList patientList;
        private final TreatmentQueue normalQueue;
        private final TreatmentQueue priorityQueue;
        private final DischargeStack dischargeStack;
        private final  HashMap<Integer, Patient> patientMap;

        public HospitalSystem() {
            patientList = new PatientList();
            normalQueue = new TreatmentQueue();
            priorityQueue = new TreatmentQueue();
            dischargeStack = new DischargeStack();
            patientMap = new HashMap<>();
        }

        // Yeni hasta ekleme
        public void addPatient(Patient p) {
            patientList.addPatient(p);
            patientMap.put(p.id, p);
        }

        // Tedavi isteği ekleme
        public void addTreatmentRequest(int patientId, boolean priority) {
            TreatmentRequest req = new TreatmentRequest(patientId, priority);

            if (priority) {
                priorityQueue.enqueue(req);
            } else {
                normalQueue.enqueue(req);
            }
        }



        // if there is a important it is first
        public Patient processTreatment() {

            TreatmentRequest req;

            if (priorityQueue.size() > 0) {
                req = priorityQueue.dequeue();
            } else {
                req = normalQueue.dequeue();
            }

            if (req == null) {
                System.out.println("No treatment requests.");
             
            }

         /*
            dischargeStack.push(
                    new DischargeRecord(req.patientId, System.currentTimeMillis())
            );*/
          /*  DischargeRecord dr = new DischargeRecord(req.patientId);
            dischargeStack.push(dr);
            return  patientMap.get(req.patientId);} */

            //patientList.removePatient(req.patientId);
            //patientMap.remove(req.patientId);

       /* // final situation of system
        public void printSystemState() {
            System.out.println("---- Current Patients ----");
            patientList.printList();

            System.out.println("\n---- Priority Queue ----");
            priorityQueue.printQueue();

            System.out.println("\n---- Normal Queue ----");
            normalQueue.printQueue();

            System.out.println("\n---- Discharge Stack ----");
            dischargeStack.printStack();
        } */



/*        public void sortPatientsBySeverity() {

                if (PatientList.head == null) return;

                boolean swapped;
                do {
                    swapped = false;
                    Node current = PatientList.head;

                while (current.next != null) {
                    if (current.data.severity < current.next.data.severity) {

                        Patient temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;

                        swapped = true;
                    }
                    current = current.next;
                }
            } while (swapped);
        }

        public void addDischargeRecord(int i) {
        }

        public void processTreatmentRequest() {
        }

        public void sortPatientsBySeverityDesc() {
        }

        // final situation of system
        public void printSystemState() {
            System.out.println("---- Current Patients ----");
            PatientList.printList();

            /*System.out.println("\n---- Priority Queue ----");
            PriorityQueue.printQueue();*/
          /*  System.out.println("\nTreatment Queue (Priority then Normal)");       //display request in  the priority queueu
            TreatmentQueue.printQueue();


            System.out.println("\n---- Normal Queue ----");
            PriorityTreatmentQueue normalQueue = null;
            normalQueue.printQueue();

            System.out.println("\n---- Discharge Stack ----");
            DischargeStack.printStack();
        }
        } */




public class HospitalSystem {
    PatientList patientList;
    TreatmentQueue treatmentQueue;
    DischargeStack dischargeStack;
    java.util.HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new java.util.HashMap<Integer, Patient>();
    }

    public void addPatient(Patient patient) {
        patientList.addPatient(patient);
        patientMap.put(patient.id, patient);
    }

    public void addTreatmentRequest(int patientId, boolean priority) {
        treatmentQueue.enqueue(new TreatmentRequest(patientId, priority));    //for priority queue
    }

    public void addDischargeRecord(int patientId) {
        dischargeStack.push(new DischargeRecord(patientId,System.currentTimeMillis()));     //pusheses  new records to the stack
    }

    public void processTreatmentRequest() {
        TreatmentRequest request = treatmentQueue.dequeue();       //priority patient first
        if(request == null) {
            System.out.println("No treatment request to process.");
            return;
        }
        System.out.println("Processing treatment for patient: " + request.patientId + "(priority: " + request.priority +  ")");   //display the patient
        dischargeStack.push(new DischargeRecord(request.patientId,System.currentTimeMillis()));
    }

    public void sortPatientsBySeverityDesc() {
        Patient[] arr = toArrayFromMap();      //sorts their severity levels that convert map values to array
        if(arr == null) {
            return;
        }
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j< arr.length-1; j++) {
                if(arr[j].severity < arr[j+1].severity) {
                    Patient temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("\nPatient Sorted By Severity (Descending): ");    //show the sorted way
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private Patient[] toArrayFromMap() {
        if(patientMap.size() == 0) {
            return null;      //no patient in the system
        }
        Patient[] arr = new Patient[patientMap.size()];      //initialize array with same size with map
        int idx =0;
        for(Integer key: patientMap.keySet()) {
            arr[idx] = patientMap.get(key);
            idx++;
        }
        return arr;
    }

    public void printSystemState() {
        System.out.println("\n CURRENT SYSTEM STATE");

        System.out.println("\nPatient List (LinkedList) ");      //display stored patient in the linkedlist
        patientList.printList();

        System.out.println("\nTreatment Queue (Priority then Normal)");       //display request in  the priority queueu
        treatmentQueue.printQueue();

        System.out.println("\nDischarge Stack (LIFO)");      //display discharge in the stack
        dischargeStack.printStack();
    }}






