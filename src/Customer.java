import javax.xml.crypto.Data;
import java.util.Objects;

public class Customer implements Comparable<Customer>{
    private int id;
    private String lastТame;
    private String firstName;
    private String adress;
    private int phoneТumber;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer(int id, String lastТame, String firstName, String adress, int phoneТumber, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.lastТame = lastТame;
        this.firstName = firstName;
        this.adress = adress;
        this.phoneТumber = phoneТumber;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(lastТame, customer.lastТame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastТame);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastТame='" + lastТame + '\'' +
                ", firstName='" + firstName + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneТumber=" + phoneТumber +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }

    public Customer(String lastТame) {
        this.lastТame = lastТame;
    }

    public Customer(String lastТame, int creditCardNumber) {
        this.lastТame = lastТame;
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public int compareTo(Customer o) {

        return o.lastТame.compareTo(lastТame) >=0 ? -1 : 0;


//        if (this.lastТame.compareTo(o.lastТame) == 1) {
//            return 1;
//        } else if (this.lastТame.compareTo(o.lastТame) == -1) {
//            return -1;
//        }else {
//            return 0;
//        }
    }


    public int getPhoneТumber() {
        return phoneТumber;
    }

    public void setPhoneТumber(int phoneТumber) {
        this.phoneТumber = phoneТumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastТame() {
        return lastТame;
    }

    public void setLastТame(String lastТame) {
        this.lastТame = lastТame;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

//    public int compareTo(Customer customer, Customer customer1) {
//        if (customer.lastТame.compareTo(customer1.lastТame) >= 1) {
//            return 1;
//        } else if (customer.lastТame.compareTo(customer1.lastТame) <= -1) {
//            return -1;
//        }else {
//            return 0;
//        }
//
//    }
}
