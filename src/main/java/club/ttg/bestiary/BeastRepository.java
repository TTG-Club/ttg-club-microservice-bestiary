package club.ttg.bestiary;

import club.ttg.bestiary.model.Beast;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeastRepository extends MongoRepository<Beast, String> {
}
