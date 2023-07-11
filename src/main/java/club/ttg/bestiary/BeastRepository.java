package club.ttg.bestiary;

import club.ttg.bestiary.model.Beast;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BeastRepository extends MongoRepository<Beast, String> {
    @Query("{'name.englishName' : ?0}")
    Collection<Beast> findByEnglishName(String englishName);
}
