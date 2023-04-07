/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization;

/**
 *
 * @author Satyanarayana
 */
public class BusTicketsMain extends Thread{
    static  BusTicketBooking b;
    int tickets;
    

    @Override
    public void run() {
        b.BusBooking(tickets);
       
    }
    public static void main(String[] args) {
        b = new BusTicketBooking();
        BusTicketsMain satya = new BusTicketsMain();
        satya.tickets = 7;
        satya.start();
        BusTicketsMain satya2 = new BusTicketsMain();
        satya2.tickets = 5;
        satya2.start();
        
    }
    
    
    
}
