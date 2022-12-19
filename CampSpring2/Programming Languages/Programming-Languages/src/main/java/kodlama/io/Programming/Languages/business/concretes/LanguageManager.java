package kodlama.io.Programming.Languages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Programming.Languages.business.abstracts.LanguageService;
import kodlama.io.Programming.Languages.business.requests.CreateLanguageRequest;
import kodlama.io.Programming.Languages.business.responses.GettAllLanguageResponse;
import kodlama.io.Programming.Languages.dataAccess.LanguageRepository;
import kodlama.io.Programming.Languages.entities.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;

	@Autowired

	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;

	}

	@Override
	public List<GettAllLanguageResponse> getAll() {
		List<Language> languages = languageRepository.findAll();
		List<GettAllLanguageResponse> languageResponses = new ArrayList<GettAllLanguageResponse>();
		for (Language language : languages) {
			GettAllLanguageResponse responseItem = new GettAllLanguageResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			responseItem.setSubtechnology(language.getSubtechnology());
			languageResponses.add(responseItem);
		}
		return languageResponses;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		language.setSubtechnology(createLanguageRequest.getSubtechnology());

		this.languageRepository.save(language);
	}
}
