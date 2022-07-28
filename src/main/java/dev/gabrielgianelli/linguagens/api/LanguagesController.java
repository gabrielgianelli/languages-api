package dev.gabrielgianelli.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguagesController {
    // private List<Language> languages = List.of(
    //     new Language("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),
    //     new Language("TypeScript", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/typescript/typescript_256x256.png", 2),
    //     new Language("JavaScript", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/javascript/javascript_256x256.png", 3)
    // );

    @Autowired
    private LanguageRepository repository;
    
    @GetMapping("/languages")
    public List<Language> getLanguages() {
        return repository.findAll();
    }
    
    @PostMapping("/languages")
    public Language registerLanguage(@RequestBody Language language) {
        return repository.save(language);
    }
}
