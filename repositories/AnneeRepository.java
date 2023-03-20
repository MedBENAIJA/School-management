package school.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import school.entities.Annee;

public interface AnneeRepository extends JpaRepository<Annee, Long>{
	Optional<Annee> findById(Long id);
	Optional<Annee> findByDesignation(String designation);
	
	List<Annee> findAll();
	
}
