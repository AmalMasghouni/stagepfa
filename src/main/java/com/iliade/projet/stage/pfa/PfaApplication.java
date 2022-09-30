package com.iliade.projet.stage.pfa;

import com.iliade.projet.stage.pfa.repositry.UtilisateurRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PfaApplication {

	public static void main(String[] args) {
	ApplicationContext ctx= SpringApplication.run(PfaApplication.class, args);
		//UtilisateurRepository ut=ctx.getBean(UtilisateurRepository.class);
	}

}
