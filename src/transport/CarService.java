package transport;

public class CarService {
    public static boolean hasSpikes(int monthNumber) {
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            return true;
        }
        else {
           return false;
        }
    }
}
