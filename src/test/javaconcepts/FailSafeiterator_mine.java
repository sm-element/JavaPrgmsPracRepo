package test.javaconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeiterator_mine {

    public static void main(String args[])
    {
        Map<Integer, String> al = new HashMap<Integer,String>();
        al.put(10,"geethaheadache");
        al.put(20,"seethetoothache");
        al.put(30,"mannaheartache");

        ConcurrentHashMap<Integer,String> chm = new ConcurrentHashMap<Integer, String>(al);

        Iterator itr = chm.keySet().iterator();

        while(itr.hasNext())
        {
            System.out.println(chm.get(itr.next()));
            chm.put(40,"testpiece");
        }
    }

}
