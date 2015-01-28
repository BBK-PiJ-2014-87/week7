package hospital;

public class HospitalManager {
	private Patient patientListStart = null;
	
	public static void main(String[] args) {
		
		HospitalManager hm = new HospitalManager();
		
		Patient firstPatient = new Patient("John", 33, "Tuberculosis");
		hm.patientListStart = firstPatient;
		
		Patient Mary = new Patient("Mary", 30, "Tuberculosis");
		hm.patientListStart.addPatient(Mary);
		
		Patient Rob = new Patient("Rob", 19, "Tuberculosis");
		hm.patientListStart.addPatient(Rob);
		
		System.out.println();
		
		hm.patientListStart.deletePatient(Rob);

//		hospital.Patient@70dea4e		
	}
	

}
