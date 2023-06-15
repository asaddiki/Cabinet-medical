package ma.enset.CabinetMedical.repositories;

import ma.enset.CabinetMedical.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    List<Consultation> findByMedecinNomContaining(String medecin_nom);


}
