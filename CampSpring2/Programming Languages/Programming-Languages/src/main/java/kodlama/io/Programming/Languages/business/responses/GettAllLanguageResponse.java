package kodlama.io.Programming.Languages.business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GettAllLanguageResponse {
	private int id;
	private String name;
	private String subtechnology;
}
