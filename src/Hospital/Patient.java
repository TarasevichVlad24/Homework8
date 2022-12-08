package Hospital;

public class Patient {
    TreatmentPlan treatmentPlan;
    Doctor doctor;

    Patient(TreatmentPlan treatmentPlan){
        this.treatmentPlan = treatmentPlan;
        if(TreatmentPlan.code == 1){
            this.doctor = new Surgeon();
        } if(TreatmentPlan.code == 2){
            this.doctor = new Dentist();
        }else{
            this.doctor = new Therapist();
        }
    }
}
