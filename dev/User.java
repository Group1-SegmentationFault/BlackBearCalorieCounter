//creates a User object. Does not yet take user activity level into account

public class User
{
    //values are in metric for the purposes of the CalorieCalc equations used; we can add options
    //for different units and convert them later
    int age;
    //gender == 'M' if user is a man, 'W' if user is a woman
    char gender;
    int height; //in cm
    int weight; //in kg

    //creates a parameterized User object
    public User(int a, char g, int h, int w)
    {
        age = a;
        gender = g;
        height = h;
        weight = w;
    }

    //essentially creates an empty User object, to be modified later
    public User()
    {
        age = 0;
        gender = 'o';
        height = 0;
        weight = 0;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public int getAge()
    {
        return age;
    }

    public void setGender(char g)
    {
        gender = g;
    }

    public char getGender()
    {
        return gender;
    }

    public void setHeight(int h)
    {
        height = h;
    }

    public int getHeight()
    {
        return height;
    }

    public void setWeight(int w)
    {
        weight = w;
    }

    public int getWeight()
    {
        return weight;
    }


}
