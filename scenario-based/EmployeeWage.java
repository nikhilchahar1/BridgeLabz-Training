public class EmployeeWage{
    public static void main(String[] args){
        System.out.println("\nWelcome to Employee Wage Computation!!\n");

        int attendance = (int) (Math.random()*10);
        int workingHours = 0, workingDays = 0, countDays = 0, dayWage = 0;

        if(attendance>4){
            System.out.println("Employee is Present for full-time\n");
            
            while((workingHours<100) && workingDays!=20){
                countDays++;
                workingHours += 8;
                if(workingHours>100){
                    int extraHours = workingHours-100;
                    workingHours -= extraHours;
                    System.out.println("Working hours for Day "+countDays+ " is " +extraHours);
                }
                else{
                    System.out.println("Working hours for Day " +countDays+ " is 8");
                }
                workingDays++;
            }

            dayWage = 8*20;
            System.out.println("\nEmployee is working 8 hours each day\nWage for one day is "+dayWage);
        }
        else{
            System.out.println("Employee is Present for part-time\n");

            while(workingHours!=100 && workingDays!=20){
                countDays++;
                System.out.println("Working hours for Day " +countDays+ " is 4");
                workingHours += 4;
                workingDays++;
            }
            dayWage = 4*20;
        }

        System.out.println("\nEmployee worked for "+workingHours+ " hours and "+workingDays+" days");
        System.out.println("So Employee's total wage is " +(workingDays*dayWage));
    }
}