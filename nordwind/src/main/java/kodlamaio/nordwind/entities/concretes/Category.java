package kodlamaio.nordwind.entities.concretes;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@Data
@Entity
@Table(name="categories")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","products"})
public class Category {
	
	@Id
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name="category_name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="picture")
	private byte[] picture;
	
	@OneToMany(mappedBy = "categories")
	private List<Product> products;
	
}
