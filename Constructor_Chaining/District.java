package Constructor_Chaining;

public class District extends States {
    String districtCollector;

    public District(String primeMinister,String chiefMinister,String districtcollector){
        super(primeMinister, chiefMinister);
        this.districtCollector = districtcollector;
    }

    public void print(){
        System.out.println("PM :-" + this.primeMinister + "\nCM :-" + this.chiefMinister + "\nDC :-" + this.districtCollector);
    }

}
