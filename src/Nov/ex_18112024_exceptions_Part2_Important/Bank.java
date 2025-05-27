package Nov.ex_18112024_exceptions_Part2_Important;

public class Bank { //Class

    //Attributes:
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) { //Parameterized constructor
        this.currency = currency;
        this.amount = amount;
    }

    //Encaptulation:
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add (Bank bankName) throws Exception{ //Functions
        if (!bankName.currency.equalsIgnoreCase("INR")){
            throw new Exception("currency missmatch");
        }
        return bankName.amount + this.amount;
    }
}
