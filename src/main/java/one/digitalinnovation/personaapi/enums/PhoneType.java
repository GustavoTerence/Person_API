package one.digitalinnovation.personaapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    NOME ("Comercial"),
    MOBILE ("Comercial"),
    COMMERCIAL ("Comercial");

    private final String description;
}
