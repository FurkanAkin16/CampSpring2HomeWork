package kodlama.io.Programming.Languages.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateLanguageRequest {
	private String name;
	private String subtechnology;
}
