package address;

import java.util.Objects;

public class HomeAddress implements Address {

    private String address;

    public HomeAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.address);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HomeAddress other = (HomeAddress) obj;
        return Objects.equals(this.address, other.address);
    }

}
