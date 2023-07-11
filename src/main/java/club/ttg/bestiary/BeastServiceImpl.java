package club.ttg.bestiary;

import club.ttg.bestiary.model.Beast;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BeastServiceImpl implements BeastService {
    private final BeastRepository beastRepository;

    @Override
    public Page<Beast> getPage(Pageable pageable) {
        return beastRepository.findAll(pageable);
    }

    @Override
    public Beast save(Beast beast) {
        return beastRepository.save(beast);
    }

    @Override
    public Optional<Beast> findByEnglishName(String englishName) {
        var beasts =  beastRepository.findByEnglishName(englishName);
        return Optional.empty();
    }
}
