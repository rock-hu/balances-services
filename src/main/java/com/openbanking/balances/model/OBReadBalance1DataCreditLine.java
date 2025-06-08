package com.openbanking.balances.model;

import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * Set of elements used to provide details on the credit line.
 */

@Schema(description = "Set of elements used to provide details on the credit line.")
@Getter
@Setter
public class OBReadBalance1DataCreditLine implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Limit type, in a coded form.
	 */
	public enum TypeEnum {
		AVAILABLE("Available"),

		CREDIT("Credit"),

		EMERGENCY("Emergency"),

		PRE_AGREED("Pre-Agreed"),

		TEMPORARY("Temporary");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public static TypeEnum fromValue(String text) {
			for (TypeEnum b : TypeEnum.values()) {
				if (String.valueOf(b.value).equals(text)) {
					return b;
				}
			}
			return null;
		}
	}

}
