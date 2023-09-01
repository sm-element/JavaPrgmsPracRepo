package test.javaconcepts;
public class SchoolObj
{
    private String name;
    private String school;

    public SchoolObj()
    {
        this(null, null);
    }

    public SchoolObj(String nameStr, String schoolStr)
    {
        this.setName(nameStr);
        this.setSchool(schoolStr);
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSchool()
    {
        return this.school;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }

    @Override
    public String toString()
    {
        return this.getName() + ' ' + this.getSchool();
    }
}