public class TreatmentRequestTask4 {


        // patient id for health
        int patientId;

        // time for patient health
        long arrivalTime;
         boolean priority;  // i added for priotary


        // Constructr
        public TreatmentRequestTask4(int patientId) {
            this.patientId = patientId;
            this.arrivalTime = System.currentTimeMillis();
        }


        public String toString() {             // Bilgileri yazdırmak için
            return "TreatmentRequest{" +
                    "patientId=" + patientId +
                    ", arrivalTime=" + arrivalTime +
                    '}';
        }
    }


