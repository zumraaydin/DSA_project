
import java.util.HashMap;

    public class HospitalSystem {

        PatientList patientList;
        TreatmentQueue normalQueue;
        TreatmentQueue priorityQueue;
        DischargeStack dischargeStack;
        HashMap<Integer, Patient> patientMap;

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
        public void processTreatment() {

            TreatmentRequest req;

            if (priorityQueue.size() > 0) {
                req = priorityQueue.dequeue();
            } else {
                req = normalQueue.dequeue();
            }

            if (req == null) {
                System.out.println("No treatment requests.");
                return;
            }

            // bye bye patient
            dischargeStack.push(
                    new DischargeRecord(req.patientId, System.currentTimeMillis())
            );

            patientList.removePatient(req.patientId);
            patientMap.remove(req.patientId);
        }

        // final situation of system
        public void printSystemState() {
            System.out.println("---- Current Patients ----");
            patientList.printList();

            System.out.println("\n---- Priority Queue ----");
            priorityQueue.printQueue();

            System.out.println("\n---- Normal Queue ----");
            normalQueue.printQueue();

            System.out.println("\n---- Discharge Stack ----");
            dischargeStack.printStack();
        }



        public void sortPatientsBySeverity() {

            if (patientList.head == null) return;

            boolean swapped;
            do {
                swapped = false;
                Node current = patientList.head;

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

    }


