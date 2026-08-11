package Constructor_Chaining;

public class States extends Country {
    String chiefMinister;

    public States(String primeMinister,String chiefMinister){
        super(primeMinister);
        this.chiefMinister = chiefMinister;
    }
}
