package Hospital;

public class Main {
    public static void main(String[] args){
        TreatmentPlan plan = new TreatmentPlan(1);
        Patient patient = new Patient(plan);
        Doctor doctor = patient.getDoctor();
        doctor.heal();
        plan = new TreatmentPlan(2);
        patient = new Patient(plan);
        doctor = patient.getDoctor();
        doctor.heal();
        plan = new TreatmentPlan(3);
        patient = new Patient(plan);
        doctor = patient.getDoctor();
        doctor.heal();
        plan = new TreatmentPlan(4);
        patient = new Patient(plan);
        doctor = patient.getDoctor();
        doctor.heal();

    }
}
