package club.ttg.bestiary;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BeastService {
    Page<Beast> getPage(Pageable pageable);
    Beast save(Beast beast);
}
