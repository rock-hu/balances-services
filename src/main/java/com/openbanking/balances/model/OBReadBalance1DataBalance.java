package com.openbanking.balances.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Set of elements used to define the balance details.
 */

@Schema(description = "Set of elements used to define the balance details.")
@Getter
@Setter
public class OBReadBalance1DataBalance implements Serializable {
	private static final long serialVersionUID = 1L;

}
