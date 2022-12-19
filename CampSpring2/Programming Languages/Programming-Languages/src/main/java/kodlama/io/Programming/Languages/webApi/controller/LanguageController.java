package kodlama.io.Programming.Languages.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Programming.Languages.business.abstracts.LanguageService;
import kodlama.io.Programming.Languages.business.requests.CreateLanguageRequest;
import kodlama.io.Programming.Languages.business.responses.GettAllLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;

	}

	@GetMapping("/getall")
	public List<GettAllLanguageResponse> getAll() {
		return languageService.getAll();

	}

	@PostMapping("/add")
	public void add(CreateLanguageRequest createLanguageRequest) {
		this.languageService.add(createLanguageRequest);
	}
}
