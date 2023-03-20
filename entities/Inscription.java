package school.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Inscription {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Date dateInsciption;
	
	@ManyToOne
	private Eleve eleve;
	
	@ManyToOne
	private Annee annee;
	
	@ManyToOne
	private NiveauScolaire niveauScolaire;
	
	@ManyToOne
	private Groupe groupe;
	
}
