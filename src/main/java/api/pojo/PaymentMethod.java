package api.pojo;

public class PaymentMethod {
    private String type;
    private String provider;
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getProvider() {
        return provider;
    }
    public void setProvider(String provider) {
        this.provider = provider;
    }
    public String getLast_four() {
        return last_four;
    }
    public void setLast_four(String last_four) {
        this.last_four = last_four;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    private String last_four;
    private String account;
}
