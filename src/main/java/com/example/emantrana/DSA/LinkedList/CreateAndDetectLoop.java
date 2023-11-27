package com.example.emantrana.DSA.LinkedList;



    import java.util.Scanner;

    public class CreateAndDetectLoop {


        static void createLoop(Node head, int k) {
            if (head == null) {
                return;
            }
            Node temp = head;
            int count = 1;
            while (count < k) {
                temp = temp.next;
                count++;
            }

            Node connectedPoint = temp;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = connectedPoint;
        }


        static boolean detectLoop(Node head) {
            Node sptr = head;
            Node fptr = head;

            while (fptr != null && fptr.next != null) {
                sptr = sptr.next;
                fptr = fptr.next.next;
                if (fptr == sptr) {
                    return true;
                }
            }

            return false;
        }


    }



