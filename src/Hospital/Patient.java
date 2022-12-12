package Hospital;

public class Patient {
    private TreatmentPlan treatmentPlan;

    Patient(TreatmentPlan treatmentPlan){
        this.treatmentPlan = treatmentPlan;
    }

    public Doctor getDoctor(){
        if(treatmentPlan.code == 1){
            return new Surgeon();
        }else if(treatmentPlan.code == 2){
            return new Dentist();
        }else{
            return new Therapist();
        }
    }
}
