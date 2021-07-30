package kodlamaio.nordwind.entities.concretes;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@Column(name = "customer_id")
	private String id;
	
	@Column(name = "company_name")
	private String name;
	
	@Column(name = "contact_name")
	private String contact;
	
	@Column(name = "contact_title")
	private String title;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "region")
	private String region;
	
	@Column(name = "postal_code")
	private String postcode;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "fax")
	private String fax;
	
}
