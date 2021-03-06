package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.User;

public interface IContratService {
	List<Contrat> retrieveAllContrats(); 
	Contrat addContrat(Contrat c);
	void deleteContrat(String id);
	Contrat updateContrat(Contrat c);
	Contrat retrieveContrat(String id);

}
