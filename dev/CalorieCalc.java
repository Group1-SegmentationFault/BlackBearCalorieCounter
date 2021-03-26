//This class is based on equations and info found here: https://www.calculator.net/calorie-calculator.html
//I have not yet taken user activity level into account; that's something to be added in the future

//These methods return # of daily calories to maintain weight. For weight loss, subtract 500. For weight gain,
//add 500.
public class CalorieCalc
{
    //use this calorieCalc method if user is a man (user.getGender() == 'M')
    public int calorieCalcM(User man)
    {
        return 10*man.getWeight() + ((int)6.25*man.getHeight()) - 5*man.getAge() + 5;
    }

    //use this calorieCalc method if user is a woman (user.getGender() == 'W')
    public int calorieCalcW(User woman)
    {
        return 10*woman.getWeight() + ((int)6.25*woman.getHeight()) - 5*woman.getAge() - 161;
    }
}
