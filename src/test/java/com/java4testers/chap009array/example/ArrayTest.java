package com.java4testers.chap009array.example;

import com.java4testers.domainentities.User;
import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;
import java.util.Arrays;

public class ArrayTest {
    @Test
    public void createAnArrayOfUsers() {
        User[] users = new User[3];

        users[0] = new User("lien", "123");
        users[1] = new User("thuong", "456");
        users[2] = new User("sonic", "789");

        assertEquals("lien", users[0].getUsername());
        assertEquals("thuong", users[1].getUsername());
        assertEquals("sonic", users[2].getUsername());

        //Iterate over the array of users
        for (User pUser : users) {
            System.out.print(pUser.getUsername() + " - ");
        }
    }

    @Test
    public void createOneHundredUsers() {
        User[] users = new User[100];

        for (int index = 0; index < users.length; index++) {
            int userID = index + 1;
            users[index] = new User("user" + userID, "pass" + userID);
            assertEquals("user" + userID, users[index].getUsername());
            assertEquals("pass" + userID, users[index].getPassword());
        }
        //check Creation
        for (User cUser : users) {
            System.out.println(cUser.getUsername() + " - " + cUser.getPassword());
        }
    }

    @Test
    public void sortArray() {
        String[] workday = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workday);
        assertEquals("Friday", workday[0]);
        assertEquals("Monday", workday[1]);
        assertEquals("Thursday", workday[2]);
        assertEquals("Tuesday", workday[3]);
        assertEquals("Wednesday", workday[4]);
    }

    @Test
    public void createTriangle2dArray(){
        int[][]triangle = new int [16][];
        for(int row=0; row<triangle.length; row++){
            triangle[row] = new int[row+1];
            for(int i=0; i< (row+1); i++){
                triangle[row][i] = i;
            }
        }
        print2DIntArray(triangle);
    }

    public void print2DIntArray(int [][]multi) {
        for (int[] outer : multi) {
            if (outer==null) {
                System.out.println("null");
            } else {
                for (int inner : outer) {
                    System.out.println(inner + ",");
                }
            }
            System.out.println("");
        }
    }
}
