import java.util.ArrayList;
public class StepTracker{
  private final int minimum;
  private int activeDays, days, steps;

  public StepTracker(int minimum){
    this.minimum = minimum;
    steps = 0;
    activeDays = 0;
    days = 0;
  }

  public void addDailySteps(int stepsForDay){
    if(stepsForDay >= minimum){
      activeDays++;
    }
    days++;
    steps += stepsForDay;
    }
   public int activeDays(){
      return activeDays;
    }
   public double averageSteps(){
      if(days == 0){
        return 0;
      }
      return steps / (double) days;
   }
} 
