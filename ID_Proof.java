public class ID_Proof {
    private long aadhaarNumber;
    private String name;
    private String dob;
    private long mobileNumber;
    private String address;

    public ID_Proof(long aadhaarNumber, String name, String dob,long mobileNumber,String address)
    {
        setAadhaarNumber(aadhaarNumber);
        this.name = name;
        this.dob = dob;
        setMobileNumber(mobileNumber);
        this.address = address;
    }

    public long getAadhaarNumber()
    {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(long aadhaarNumber)
    {
        long temp = aadhaarNumber;
        int count = 0;

        while (temp>0) {
            temp = temp/10;
            count++;
        }
        if(count == 12) {
            this.aadhaarNumber = aadhaarNumber;
        }
        else
            System.out.println("*************   Invalid Aadhaar Number   *************");
    }

    public long getMobileNumber()
    {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber)
    {
        long temp = mobileNumber;
        int count = 0;

        while (temp>0) {
            temp = temp / 10;
            count++;
        }
        if(count == 10) {
            this.mobileNumber = mobileNumber;
        }
        else
            System.out.println("***************  Invalid Mobile Number  ****************");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDob(){
        return dob;
    }

    public void setDob(String dob){
        this.dob = dob;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
