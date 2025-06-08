package com.openbanking.balances.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Amount of money of the cash balance.
 */

@Schema(description = "Amount of money of the cash balance.")
@Getter
@Setter
public class OBReadBalance1DataAmount implements Serializable {
	private static final long serialVersionUID = 1L;

}
