package kodlama.io.Programming.Languages.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Programming.Languages.entities.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {

}
