package ma.enset.CabinetMedical;

import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.service.ICabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabinetMedicalApplication implements CommandLineRunner {
    @Autowired
    //private PatientRepository patientRepository;
    private ICabinetService cabinetService;

    public static void main(String[] args) {
        SpringApplication.run(CabinetMedicalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		/* Patient p1=new Patient(null, "Hasnaoui", "Abdelali", "GH44533", "0663449819", "hasnaoui12@gmail.com", new Date(), null);
		//patientRepository.save(p1);

		/*List<Patient> patients = patientRepository.findAll();
		for (Patient p:patients) {
			System.out.println(p.getNom()+" "+p.getPrenom()+" "+p.getEmail());
		}

		Patient p=patientRepository.findById(2l).get();
		p.setPrenom("Karim");
		patientRepository.save(p);

		patientRepository.deleteById(2l);

		Patient p1=new Patient();
		p1.setNom("Hidar");
		p1.setPrenom("Salah");
		p1.setCin("TA44678");
		p1.setTel("0677103428");
		p1.setEmail("hidar34@gmail.com");
		p1.setDateNaissance(new Date());
		cabinetService.addPatient(p1);

		Medecin m1=new Medecin();
		m1.setNom("TAZI");
		m1.setPrenom("Nabil");
		m1.setEmail("n.tazi@gmail.com");
		m1.setTel("0661402254");
		cabinetService.addMedecin(m1);

		Medecin m1= cabinetService.getMedecinById(3l);
		Patient p1= cabinetService.getPatientById(1l);
		Consultation c1=new Consultation();
		c1.setDateConsultation(new Date());
		c1.setDescription("description de consultation");
		c1.setPatient(p1);
		c1.setMedecin(m1);
		cabinetService.addConsultation(c1);*/

        Consultation c2 = cabinetService.getConsultationById(5l);
        System.out.println(c2.getDescription() + " " + c2.getMedecin().getNom() + " " + c2.getPatient().getNom());

    }
}