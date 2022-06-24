package chapter2.ch10;

public class BirthDay {

    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        
        switch(month) {

                case 1, 3, 5, 7, 8, 10, 12 -> {

                    if(day >= 1 && day <= 31) {
                  
                        this.day = day;
                        isValid = true;
            
                    }
                    else
                  
                    isValid = false;
                      
                }
            
                case 2 -> {
            
                    if(day >= 1 && day <= 28) {
            
                        this.day = day;
                        isValid = true;
        
                    }else
        
                    isValid = false;
        
                }
        
                case 4, 6, 9, 11 -> {
        
                    if(day >= 1 && day <= 30) {
        
                        this.day = day;
                        isValid = true;
        
                    }else
        
                    isValid = false;
        
                }
            }
        }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {

        if(month >= 1 && month <= 12) {
            this.month = month;
            isValid = true;
        } else
        
        isValid = false;
        
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
  
    public void showDate()
    {
        if (isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일");
        }
       
        else {
            System.out.println("유효하지 않은 날짜입니다");
        }

    }

}
