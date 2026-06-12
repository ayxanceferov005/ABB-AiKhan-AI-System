import java.util.Random;

public class OTPVerification {

    private int otp;

    public void generateOTP() {
        otp = 100000 + new Random().nextInt(900000);
        System.out.println("OTP sent: " + otp);
    }

    public boolean verifyOTP(int input) {
        if (input == otp) {
            System.out.println("OTP Verified Successfully ✅");
            return true;
        } else {
            System.out.println("Invalid OTP ❌");
            return false;
        }
    }
}