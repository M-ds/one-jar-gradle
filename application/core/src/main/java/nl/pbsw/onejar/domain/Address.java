package nl.pbsw.onejar.domain;

public class Address {

    private final String streetName;
    private final int streetNumber;
    private final String streetNumberExtension;
    private final String postalCode;
    private final String city;

    public Address(String streetName, int streetNumber, String streetNumberExtension, String postalCode, String city) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.streetNumberExtension = streetNumberExtension;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetNumberExtension() {
        return streetNumberExtension;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public static class Builder {
        private String streetName = null;
        private int streetNumber = -1;
        private String streetNumberExtension = null;
        private String postalCode = null;
        private String city = null;

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setStreetNumber(int streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetNumberExtension(String streetNumberExtension) {
            this.streetNumberExtension = streetNumberExtension;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Address build() {
            return new Address(streetName, streetNumber, streetNumberExtension, postalCode, city);
        }
    }
}
