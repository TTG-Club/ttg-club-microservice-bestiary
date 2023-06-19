package club.ttg.bestiary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/bestiary")
public class BeastController {
    @Autowired
    private BeastService beastService;

    @GetMapping
    public void getAll() {

    }
    @GetMapping("/{englishName}")
    public Beast getBeast(@PathVariable String englishName) {
        return null;
    }
    @PostMapping("/{englishName}")
    public Beast addBeast(@PathVariable String englishName) {
        return null;
    }
    @PutMapping("/{englishName}")
    public Beast updateBeast(@PathVariable String englishName) {
        return null;
    }
}
