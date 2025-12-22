/*public class TreatmentRequest {

    // patient id for health
    int patientId;

    // time for patient health
    long arrivalTime;


    // Constructr
    public TreatmentRequest(int patientId, boolean priority) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
    }


    public String toString() {             // Bilgileri yazdırmak için
        return "TreatmentRequest{" +
                "patientId=" + patientId +
                ", arrivalTime=" + arrivalTime +
                '}';
    }
}*/
public class TreatmentRequest {

    int patientId;
    long arrivalTime;
    boolean priority;

    // Task 2 için (priority yok)
    public TreatmentRequest(int patientId) {
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
        this.priority = false;
    }

    // Task 4 için
    public TreatmentRequest(int patientId, boolean priority) {
        this.patientId = patientId;
        this.priority = priority;
        this.arrivalTime = System.currentTimeMillis();
    }
}

