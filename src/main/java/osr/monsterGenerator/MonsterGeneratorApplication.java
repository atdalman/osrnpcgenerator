package osr.monsterGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import osr.monsterGenerator.repository.AttributeDAO;
import osr.monsterGenerator.service.NPCFactory;

@SpringBootApplication
public class MonsterGeneratorApplication implements CommandLineRunner {

	@Autowired
	private NPCFactory npcFactory;

	@Autowired
	private AttributeDAO attributeDao;

	public static void main(String[] args) {
		SpringApplication.run(MonsterGeneratorApplication.class, args);
	}

	@Override
	public void run(String... args) {
        System.out.println("Application running... Further configuration is done by scheduler.");
    }

}