import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TradeApp {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "your_account_sid";
    public static final String AUTH_TOKEN = "your_auth_token";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String from = "+15555555555";
        String to = "+16666666666";
        String item = "book";
        String price = "20";
        String message = "I would like to trade my " + item + " for $" + price + ". Please let me know if you're interested.";

        Message sms = Message.creator(new PhoneNumber(to), new PhoneNumber(from), message).create();

        System.out.println(sms.getSid());
    }
}

