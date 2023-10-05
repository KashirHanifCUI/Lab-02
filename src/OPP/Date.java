package OPP;

public class Date {
    private int date;
    private int year;
    private int month;
    public Date(int date,int year, int month) {
        this.date = date;
        this.year = year;
        this.month = month;
    }
        public void setDate(int date) {
            this.date = date;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public void setMonth(int month) {
            this.month = month;
        }
        public int getDate() {
            return date;
        }
        public int getYear() {
            return year;
        }
        public int getMonth() {
            return month;
        }
        public String toString() {
            String display = String.format("%2d - %s - %4d",date,month,year);
            return display;
        }
    public  Date isGreater(Date d1,Date d2) {
        if (d1.getYear() > d2.getYear()) {
            return d1;
        }
        else if(d1.getMonth() > d2.getMonth()) {
            return d1;
        }
        else if(d1.getDate() > d1.getDate()) {
            return d1;
        }
        else {
            return d2;
        }
    }
    }
