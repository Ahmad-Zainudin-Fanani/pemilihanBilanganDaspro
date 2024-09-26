import java.util.Scanner;
/**
 * PemilihanHari02
 */
public class PemilihanHari02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklarasi variable dayName dan dayType bertipe String
        String dayName, dayType;
        //perintah untuk membaca input
        System.out.print("Input day name: ");
        dayName = sc.nextLine();
        //Tambahkan switch case untuk mengelompokkan tipe hari
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
            //Cetak hasil ke layar
            System.out.println(dayName + "is a" + dayType);

            sc.close();
        }
    }
}