package club.ttg.bestiary;

import club.ttg.bestiary.model.Beast;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Tag(name = "Бестиарий")
@RestController
@RequestMapping("/api/v2/bestiary")
public class BeastController {
    private final BeastService beastService;

    @Operation(summary = "Возвращает список существ на страницу")
    @GetMapping
    public Page<Beast> getAll(@ParameterObject Pageable pageable) {
        return beastService.getPage(pageable);
    }

    @Operation(summary = "Возвращает json существа по его английскому имени")
    @GetMapping("/{englishName}")
    public Beast getBeast(@PathVariable final String englishName) {
        return beastService.findByEnglishName(englishName)
                .orElseThrow(BeastNotFoundException::new);
    }

    @Operation(summary = "Добавление нового существа")
    @PostMapping
    public Beast addBeast(@RequestBody final Beast beast) {
        return beastService.save(beast);
    }


    @Operation(summary = "Обновление существа")
    @PutMapping
    public Beast updateBeast(@PathVariable final String englishName,
                             @RequestBody final Beast beast) {
        return beastService.save(beast);
    }
}
