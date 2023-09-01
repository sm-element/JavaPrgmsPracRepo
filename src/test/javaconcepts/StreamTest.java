package test.javaconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest
{
    public static void main(String[] args)
    {
        List<SchoolObj> listOne = new ArrayList<SchoolObj>();
        // TODO: Add sample data to listOne.
        listOne.add(new SchoolObj("nameA", "schoolX"));
        listOne.add(new SchoolObj("nameC", "schoolZ"));

        List<SchoolObj> listTwo = new ArrayList<SchoolObj>();
        // TODO: Add sample data to listTwo.
        listTwo.add(new SchoolObj("nameA", "schoolX"));
        listTwo.add(new SchoolObj("nameB", "schoolY"));

        // Print results from loop method.
        System.out.println("Results from loop method:");
        List<SchoolObj> resultsViaLoop = StreamTest.createSharedListViaLoop(listOne, listTwo);
        for (SchoolObj obj : resultsViaLoop)
        {
            System.out.println(obj);
        }

        // Print results from stream method.
        System.out.println("Results from stream method:");
        List<SchoolObj> resultsViaStream = StreamTest.createSharedListViaStream(listOne, listTwo);
        for (SchoolObj obj : resultsViaStream)
        {
            System.out.println(obj);
        }
    }

    public static List<SchoolObj> createSharedListViaLoop(List<SchoolObj> listOne, List<SchoolObj> listTwo)
    {
        List<SchoolObj> result = new ArrayList<SchoolObj>();

        for (SchoolObj one : listOne)
        {
            for (SchoolObj two : listTwo)
            {
                if (one.getName().equals(two.getName()) && one.getSchool().equals(two.getSchool()))
                {
                    result.add(one);
                }
            }
        }

        return result;
    }

    public static List<SchoolObj> createSharedListViaStream(List<SchoolObj> listOne, List<SchoolObj> listTwo)
    {
        List<SchoolObj> listOneList = listOne.stream().filter(two -> listTwo.stream()
              .anyMatch(one -> one.getName().equals(two.getName()) && two.getSchool().equals(one.getSchool()))) 
              .collect(Collectors.toList());

        return listOneList;
    }
}
