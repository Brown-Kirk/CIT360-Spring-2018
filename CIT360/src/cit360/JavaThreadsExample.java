package cit360;

public class JavaThreadsExample {

    /*
        This class shows how two threads can run parallel to each other.
        This creates the output for each thread and displays it in the console
    */
    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n", threadName, message);
    }

    /*
        This class uses Runnable to create a second thread, with messages popping
        up from both threads.
    */
    private static class MessageLoop
        implements Runnable {
        public void run() {
            /*
                This array of strings contains the messages for the 
                "DaThreadWithDaMessage" thread.
            */
            String importantInfo[] = {
                "This is the MessageLoop thread",
                "How much wood would a woodchuck chuck",
                "If a woodchuck could chuck wood",
                "A woodchuck would chuck as much wood as a woodchuck could chuck",
                "If a woodchuck could chuck wood"
            };
            try {
                /*
                    This section uses a for loop to output one of the strings
                    from the above array every 2 seconds. until all of the
                    strings in the array have been processed.
                */
                for (int i = 0;
                     i < importantInfo.length;
                     i++
                ) 
                {
                    Thread.sleep(2000);
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done! What broke?");
            }
        }
    }

    public static void main(String args[])
        throws InterruptedException {
            /*
                This makes sure the program will run no longer than one minute 
                (60,000 milliseconds)
            */
        long maxWait = 60000;
            /*
                If any arguments are passed, then check to ensure it is an integer,
                then set that number as the maximum number of seconds the program 
                can run
            */
        if (args.length > 0) {
            try {
                maxWait = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.setName("DaThreadWithDaMessage");
        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");
        /*
            This while loop checks every second (1000 milliseconds) to see if
            DaThreadWithDaMessage has completed. If so, the program ends. If
            not, then it loops again.
        */
        while (t.isAlive()) {
            threadMessage("Main is still thinking...");
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > maxWait)&& t.isAlive()
            ) 
            {
                threadMessage("Tired of waiting!");
                t.interrupt();
                t.join();
            }
        }
        threadMessage("DaThreadWithDaMessage is finally done, so this is Main, signing off!");
    }
}