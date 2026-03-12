package Assignment.Lab3;

import Assignment.Lab3.accesscontrol.AccessExample;

public class AccessDemo {
    public static void main(String[] args) {
        AccessExample example = new AccessExample();

        System.out.println(example.publicVar);

//         System.out.println(example.protectedVar); // Not accessible
//         System.out.println(example.defaultVar);   // Not accessible
    }
}