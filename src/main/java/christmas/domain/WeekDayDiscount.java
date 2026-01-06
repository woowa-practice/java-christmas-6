//package christmas.domain;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public class WeekDayDiscount {
//    private int amount;
//
//    public WeekDayDiscount(){
//        this.amount=2023;
//    }
//
//    public int weekdayAmount(int day, List<String> menu){
//        if(!isWeekDay(day)){
//            return 0;
//        }
//        int count=0;
//        for (String m : menu) {
//            if(Menu.getDessert().contains(Menu.from(m).getName())){
//                count++;
//            }
//        }
//        return count*amount;
//    }
//
//    //월1화2수3목4금5토6일7
//    private boolean isWeekDay(int day){
//        LocalDate date=LocalDate.of(2023, 12, day);
//        return date.getDayOfWeek().getValue()<5;
//    }
//}
