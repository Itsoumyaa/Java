public class IsWeekdayEnums {
    public static void main(String[] args) {
       for(Day day: Day.values()){
           if(day.isweekdend()){
               System.out.println(day + " is weekend");
           } else{
               System.out.println(day + " is weekday ");
           }
       }
    }
    enum Day{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
        public boolean isweekdend(){
            return this==SATURDAY || this==SUNDAY;
        }
    }
}
