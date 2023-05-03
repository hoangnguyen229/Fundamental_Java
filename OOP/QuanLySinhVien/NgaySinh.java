package OOP.QuanLySinhVien;

public class NgaySinh {
        private int day;
    private int month;
        private int year;
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public NgaySinh(int day, int month, int year){
        if(day>=1 && day<=31) {
            this.day = day;
        }else{
            this.day = 1;
        }
        if(month>=1 && month<=12) {
            this.month = month;
        }else{
            this.month = 1;
        }
        if(year>=0) {
            this.year = year;
        }else{
            this.year = 1;
        }
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
