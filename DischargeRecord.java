public class DischargeRecord {

    // patient id number that leaved hospital(taburcu edilen yani)
    int patientId;

    // when patient leave hospital (timestamp)
    long dischargeTime;

    // constructor for discharge
    public DischargeRecord(int patientId, long dischargeTime) {
        this.patientId = patientId;
        this.dischargeTime = dischargeTime;
    }

    public String toString() {
        return "DischargeRecord{" +
                "patientId=" + patientId +
                ", dischargeTime=" + dischargeTime +
                '}';
    }
}
