public class Auth {
    private int AccountNo = 1234;
    private int Password = 1234;
    private int Balence=0;
    void SetAccountNo(int AccountNo){
        this.AccountNo=AccountNo;
    }
    void SetPassword(int Password){
        this.Password= Password;
    }
    int getAccountNo() {
        return AccountNo;
    }
    int getPassword(){
        return Password;
    }
    boolean check(int AccountNo , int password){
        return this.AccountNo == AccountNo && this.Password == password;
    }
    public void setBalence(int Balence) {
        this.Balence = Balence;
        System.out.println();
    }
    public int getBalence() {
        return Balence;
    }
}
