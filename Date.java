public class Date {
private int month;
private int day;
private int year;
// sets up the date
public Date(int month, int day, int year) {
setMonth(month);
setDay(day);
this.year = year;
}
public int getMonth() {
return month;
}
// makes sure the month is valid
public void setMonth(int month) {
if (month >= 1 && month <= 12) {
this.month = month;
} else {
System.out.println("Error: month must be between 1 and 12.");
}
}
public int getDay() {
return day;
}
// makes sure the day is valid
public void setDay(int day) {
if (day >= 1 && day <= 31) {
this.day = day;
} else {
System.out.println("Error: day must be between 1 and 31.");
}

}
public int getYear() {
return year;
}
public void setYear(int year) {
this.year = year;
}
// shows the date with numbers
public void displayNumeric() {
System.out.println(month + "/" + day + "/" + year);
}
// shows the month first
public void displayMonthFirst() {
System.out.println(getMonthName() + " " + day + ", " + year);
}
// shows the day first
public void displayDayFirst() {
System.out.println(day + " " + getMonthName() + " " + year);
}
// gets the month name from the number
private String getMonthName() {
String[] monthNames = {
"", "January", "February", "March", "April", "May", "June",
"July", "August", "September", "October", "November", "December"
};
if (month >= 1 && month <= 12) {
return monthNames[month];
}
return "Invalid Month";
}
}