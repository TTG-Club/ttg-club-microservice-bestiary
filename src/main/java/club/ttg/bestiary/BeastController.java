package club.ttg.bestiary;

import club.ttg.bestiary.model.Beast;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@Tag(name = "Бестиарий")
@RestController
@RequestMapping("/api/v2/bestiary")
public class BeastController {
    @Autowired
    private BeastService beastService;

    @Operation(summary = "Возвращает список существ на страницу")
    @GetMapping
    public Page<Beast> getAll(@ParameterObject Pageable pageable) {
        return null;
    }

    @GetMapping("/{englishName}")
    public Beast getBeast(@PathVariable final String englishName) {
        return null;
    }

    @PostMapping
    public Beast addBeast(@PathVariable final String englishName,
                          @RequestBody final Beast beast) {
        return beastService.save(beast);
    }

    @PutMapping
    public Beast updateBeast(@PathVariable final String englishName,
                             @RequestBody final Beast beast) {
        return null;
    }
}
