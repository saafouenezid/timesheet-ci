package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.ContratRepository;
@Service
public class ContratServiceImpl implements IContratService{

	@Autowired
	ContratRepository contratRepository;
	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);
	@Override
	public List<Contrat> retrieveAllContrats() {
		List<Contrat> contracts = null;
		try {

		l.info("In retrieveContarcts() : ");
		contracts = (List<Contrat>) contratRepository.findAll();
		//l.debug("contract +++ : " + contarct);
		for (Contrat contrat : contracts) {
		//l.debug("contrat+++ : " + contrat);
		}
		l.info("Out of retrieveAllContracts() : ");
		}catch (Exception e) {
		l.error("Error in retrieveAllContrats() : " + e);
		}

		return contracts;
	}

	@Override
	public Contrat addContrat(Contrat c) {
		return  contratRepository.save(c);
		
	}

	@Override
	public void deleteContrat(String id) {
		contratRepository.deleteById(Integer.parseInt(id));
		
	}

	@Override
	public Contrat updateContrat(Contrat c) {
		return  contratRepository.save(c);
	}

	@Override
	public Contrat retrieveContrat(String id) {
		l.info("in  retrieveContrat id = " + id);

		Contrat c =  contratRepository.findById(Integer.parseInt(id)).get();
		l.info("contrat returned : " + c);
		return c;
	}

}
