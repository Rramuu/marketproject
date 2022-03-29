package fr.acensi.catalog.resources;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerResource {
	private Long ManufacturerId;
	private String name;
}
