/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360;

/**
 *
 * @author reddo
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    public static void main(String[] args) {
        // Creating ExcutorService with a size of 2
        // Three tasks below will be submitted 2 at a time
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Creating first runnable task
        Runnable task1 = () -> {
            // Output to show start order
            System.out.println("Starting Task1");
            try {
                // Wait 2 seconds
                Thread.sleep(2000);
                // Output to show finish order
                System.out.println("Ending Task1");
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };

        // Creating task2 - same comments, not gonna type them again
        Runnable task2 = () -> {
            System.out.println("Starting Task2");
            try {
                Thread.sleep(5000);
                System.out.println("Ending Task2");
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };

        // Starting task3 - ditto
        Runnable task3 = () -> {
            System.out.println("Starting Task3");
            try {
                Thread.sleep(1000);
                System.out.println("Ending Task3");
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };

        // Output showing start of program
        System.out.println("Submitting the tasks for execution...");
        // Add each task to executorService
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        // Kill the executorService
        executorService.shutdown();
    }
}