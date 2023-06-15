package ma.enset.CabinetMedical.service;

import lombok.AllArgsConstructor;
import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Medecin;
import ma.enset.CabinetMedical.entities.Patient;
import ma.enset.CabinetMedical.repositories.ConsultationRepository;
import ma.enset.CabinetMedical.repositories.MedecinRepository;
import ma.enset.CabinetMedical.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CabinetServiceImpl implements ICabinetService {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    ConsultationRepository consultationRepository;
    @Autowired
    MedecinRepository medecinRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public List<Patient> searchPatientsByQuery(String query) {
        return patientRepository.findPatientsByNomContainsOrPrenomContains(query, query);
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);

    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);

    }

    @Override
    public void addMedecin(Medecin medecin) {
        medecinRepository.save(medecin);

    }

    @Override
    public List<Medecin> getAllMedecins() {
        return medecinRepository.findAll();
    }

    @Override
    public List<Medecin> searchMedecinsByQuery(String query) {
        return medecinRepository.findMedecinsByNomContainsOrPrenomContains(query, query);
    }

    @Override
    public void deleteMedecinById(Long id) {
        medecinRepository.deleteById(id);

    }

    @Override
    public void addConsultation(Consultation consultation) {
        consultationRepository.save(consultation);

    }

    @Override
    public void deleteConsultationById(Long id) {
        consultationRepository.deleteById(id);

    }

    @Override
    public Medecin getMedecinById(Long id) {
        return medecinRepository.findById(id).get();
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public List<Consultation> searchConsultationsByMedecin(String medecin_nom) {
        return consultationRepository.findByMedecinNomContaining(medecin_nom);
    }
}
