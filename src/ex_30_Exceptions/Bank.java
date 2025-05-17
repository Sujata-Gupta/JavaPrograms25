package ex_30_Exceptions;

public class Bank {
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    private String currency;
    private Integer amount;

    public Integer add(Bank bankname) {
        if (bankname.currency.equals("INR")) {
            return bankname.amount + this.amount;
        } else {
            try {
                throw new currencyMismatchCustomException("Currency Mismatch");
            } catch (currencyMismatchCustomException e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }
class currencyMismatchCustomException extends Exception{

            currencyMismatchCustomException(String msg)
            {
                super(msg);
            }

}


}
