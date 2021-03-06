package ClassDataMembers;

public class Date {
    public int month;
    public int day;
    public int year;

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public Date(int m, int y) {

    }

    public Date() {
        month = 0;
        day = 0;
        year = 0;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int d) {
        day = d;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setYear(int y) {
        year = y;
    }
}
