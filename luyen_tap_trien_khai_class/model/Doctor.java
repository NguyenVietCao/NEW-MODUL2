package luyen_tap_trien_khai_class.model;

public class Doctor {
    public String doctorName;
    public String doctorAge;
    public String doctorAddress;
    public String doctorEmail;
    public String doctorNumberPhone;
    public String workingPosition;

    public Doctor() {
    }

    public Doctor(String doctorName, String doctorAge, String doctorAddress, String doctorEmail, String doctorNumberPhone, String workingPosition) {
        this.doctorName = doctorName;
        this.doctorAge = doctorAge;
        this.doctorAddress = doctorAddress;
        this.doctorEmail = doctorEmail;
        this.doctorNumberPhone = doctorNumberPhone;
        this.workingPosition = workingPosition;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(String doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getDoctorNumberPhone() {
        return doctorNumberPhone;
    }

    public void setDoctorNumberPhone(String doctorNumberPhone) {
        this.doctorNumberPhone = doctorNumberPhone;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }
    static Doctor doctor = new Doctor("Cao", "21","Tuha","vietcao2510","0905451778","student");

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorName='" + doctorName + '\'' +
                ", doctorAge='" + doctorAge + '\'' +
                ", doctorAddress='" + doctorAddress + '\'' +
                ", doctorEmail='" + doctorEmail + '\'' +
                ", doctorNumberPhone='" + doctorNumberPhone + '\'' +
                ", workingPosition='" + workingPosition + '\'' +
                '}';
    }
    public  String getInformationToCsv(){
        return doctorName + ","+ doctorAge +","+ doctorAddress +","+ doctorEmail +","+ doctorNumberPhone +","+ workingPosition;
    }
    public static void displayDoctor(){
        System.out.print(doctor);
    }
}
