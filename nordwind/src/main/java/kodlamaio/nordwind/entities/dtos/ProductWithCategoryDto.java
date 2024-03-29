package kodlamaio.nordwind.entities.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {
	private int id;
	private String productName;
	private String categoryName;
}
