/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuyendung;

/**
 *
 * @author huy
 */
import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        thisinh[] a = new thisinh[n];
        for(int i=0;i<n;i++)
            a[i].input();
        for(int i=0;i<n;i++)
            a[i].output();
    }
   
}
