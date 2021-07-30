package kodlamaio.nordwind.entities.concretes;

import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;	

	@Column(name = "product_name")
	private String productName;

	@Column(name = "unit_price")
	private double unitPrice;
	
	@Column(name = "units_in_stock")
	private short unitsInStock;
	
	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "category_id")
	private Category categories;
}
