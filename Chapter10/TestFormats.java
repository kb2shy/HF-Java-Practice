import java.util.Calendar;
import java.util.Date;

/**
 * TestFormats
 */
public class TestFormats {

  public static void main(String[] args) {
    // String s = String.format("%, d", 1000000000);
    // System.out.println(s);
    // System.out.println(String.format("I have %,.2f bugs to fix", 476578.09876));
    // String dateTime = String.format("%tc", new Date());
    // System.out.println(dateTime);
    // dateTime = String.format("%tr", new Date());
    // System.out.println(dateTime);
    // Date today = new Date();
    // dateTime = String.format("%tA, %<tB %<td", today);
    // System.out.println(dateTime);
    Calendar c = Calendar .getInstance();
    c.set(2004, 0, 7, 15, 40);
    long day1 = c.getTimeInMillis();
    day1 += 1000 * 60 * 60;
    c.setTimeInMillis(day1);
    System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
    c.add(c.DATE, 35);
    System.out.println("add 35 days " + c.getTime());
    c.roll(c.DATE, 35);
    System.out.println("roll 35 days " + c.getTime());
    c.set(c.DATE, 1);
    System.out.println("set to 1 " + c.getTime());
  }
}