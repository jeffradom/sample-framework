package nonUIutilities;

/**
 * Created by jeffradom on 2/22/17.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class nonUIutility1 {

    String DATE_FORMAT_TODAY_DATE = "M/dd/yyyy";
    String DATE_FORMAT_TODAY_DATE_TIME = "M/dd/yyyy hh:mm a";

    public String today_date() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_TODAY_DATE);
        return sdf.format(cal.getTime());
    }

    public String today_date_time() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_TODAY_DATE_TIME);
        return sdf.format(cal.getTime());
    }


}
