public class ID_ProofMain {
    public static void main(String[] args) {
        
        ID_Proof id = new ID_Proof(123456789867L, "Mohan", "01-01-2005", 1987654321L, "Hyd");

        System.out.println("Aadhaar : " + id.getAadhaarNumber());
        System.out.println("Name : " + id.getName());
        System.out.println("D.O.B : " + id.getDob());
        System.out.println("Mobile : " + id.getMobileNumber());
        System.out.println("Address : " + id.getAddress());
    }
}
