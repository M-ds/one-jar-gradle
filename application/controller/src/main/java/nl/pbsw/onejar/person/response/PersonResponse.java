package nl.pbsw.onejar.person.response;

import nl.pbsw.onejar.person.dto.PersonDto;

public class PersonResponse {
    private final String errorMessage;
    private final boolean success;
    private final PersonDto personDto;

    private PersonResponse(String errorMessage, boolean success, PersonDto personDto) {
        this.errorMessage = errorMessage;
        this.success = success;
        this.personDto = personDto;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public PersonDto getPersonDto() {
        return personDto;
    }

    public static class Builder {
        private String errorMessage = "";
        private boolean succes = false;
        private PersonDto personDto = null;

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder setSucces(boolean succes) {
            this.succes = succes;
            return this;
        }

        public Builder setPersonDto(PersonDto personDto) {
            this.personDto = personDto;
            return this;
        }

        public PersonResponse build() {
            return new PersonResponse(errorMessage, succes, personDto);
        }
    }
}
