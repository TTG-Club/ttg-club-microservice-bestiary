package club.ttg.bestiary;

import club.ttg.bestiary.model.Beast;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface BeastService {
    Page<Beast> getPage(Pageable pageable);
    Beast save(Beast beast);

    Optional<Beast> findByEnglishName(String englishName);
}
