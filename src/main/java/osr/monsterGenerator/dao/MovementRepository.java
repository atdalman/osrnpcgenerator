package osr.monsterGenerator.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import osr.monsterGenerator.npcAttributes.Movement;

public interface MovementRepository extends MongoRepository<Movement, String> {

    public Movement findByMovementStyle(String movementStyle);
}