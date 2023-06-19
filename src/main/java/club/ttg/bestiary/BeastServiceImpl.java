package club.ttg.bestiary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BeastServiceImpl implements BeastService {
    @Autowired
    private BeastRepository beastRepository;

    @Override
    public Page<Beast> getPage(Pageable pageable) {
        return beastRepository.findAll(pageable);
    }

    @Override
    public Beast save(Beast beast) {
        return beastRepository.save(beast);
    }
}
