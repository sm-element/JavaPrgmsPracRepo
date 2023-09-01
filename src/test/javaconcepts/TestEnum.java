package test.javaconcepts;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class TestEnum
{
    public static AtomicInteger count = new AtomicInteger(1);

    public static enum E
    {
        One("One"),
        Two("Two");

        String s;

        E(final String s)
        {
            this.s = s;
        }

        public void set(final String s)
        {
            this.s = s;
        }

        public String get()
        {
            return this.s;
        }
    }

    public static void main(final String[] args)
    {
        doit().start();
        doit().start();
        doit().start();
    }

    static Thread doit()
    {
        return new Thread()
        {
            @Override
            public void run()
            {
                String name = "MyThread_" + count.getAndIncrement();

                System.out.println(name + " started");

                try
                {
                    int i = 100;
                    while (--i >= 0)
                    {

                        synchronized (E.One)
                        {
                            System.out.println(E.One.get());
                            E.One.set("A");
                            Thread.sleep(new Random().nextInt(100));
                            E.One.set("B");
                            Thread.sleep(new Random().nextInt(100));
                            E.One.set("C");
                            Thread.sleep(new Random().nextInt(100));
                            E.One.set("One");
                            System.out.println(E.One.get());
                        }

                    }
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                System.out.println(name + " ended");
            }
        };
    }
}