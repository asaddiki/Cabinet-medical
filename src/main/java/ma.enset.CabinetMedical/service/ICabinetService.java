package ma.enset.CabinetMedical.service;

import ma.enset.CabinetMedical.entities.Consultation;
import ma.enset.CabinetMedical.entities.Medecin;
import ma.enset.CabinetMedical.entities.Patient;

import java.util.List;

public interface ICabinetService {
    List<Patient> getAllPatients();

    List<Patient> searchPatientsByQuery(String query);

    void addPatient(Patient patient);

    void deletePatientById(Long id);

    void addMedecin(Medecin medecin);

    List<Medecin> getAllMedecins();

    abstract List<Medecin> searchMedecinsByQuery(String query);

    void deleteMedecinById(Long id);

    void addConsultation(Consultation consultation);

    void deleteConsultationById(Long id);

    Medecin getMedecinById(Long id);

    Patient getPatientById(Long id);

    List<Consultation> searchConsultationsByMedecin(String mc);
}
