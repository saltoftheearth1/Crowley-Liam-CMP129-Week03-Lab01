public class DateTest {
public static void main(String[] args) {
Date christmas = new Date(12, 25, 2014);

Date independenceDay = new Date(7, 4, 2026);
System.out.println("First date:");
christmas.displayNumeric();
christmas.displayMonthFirst();
christmas.displayDayFirst();
System.out.println();
System.out.println("Second date:");
independenceDay.displayNumeric();
independenceDay.displayMonthFirst();
independenceDay.displayDayFirst();
// changing the second date
independenceDay.setMonth(8);
independenceDay.setDay(15);
independenceDay.setYear(2027);
System.out.println();
System.out.println("Updated second date:");
independenceDay.displayNumeric();
independenceDay.displayMonthFirst();
independenceDay.displayDayFirst();
// trying some invalid values
System.out.println();
System.out.println("Testing invalid values:");
independenceDay.setMonth(13);
independenceDay.setDay(32);
System.out.println("Date after invalid changes:");
independenceDay.displayNumeric();
// testing the getters
System.out.println();
System.out.println("Retrieved month: " + independenceDay.getMonth());
System.out.println("Retrieved day: " + independenceDay.getDay());
System.out.println("Retrieved year: " + independenceDay.getYear());
}
}