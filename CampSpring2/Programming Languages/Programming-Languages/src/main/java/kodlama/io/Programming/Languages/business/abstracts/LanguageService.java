package kodlama.io.Programming.Languages.business.abstracts;

import java.util.List;

import kodlama.io.Programming.Languages.business.requests.CreateLanguageRequest;
import kodlama.io.Programming.Languages.business.responses.GettAllLanguageResponse;

public interface LanguageService {
	List<GettAllLanguageResponse> getAll();

	void add(CreateLanguageRequest createLanguageRequest);
}
