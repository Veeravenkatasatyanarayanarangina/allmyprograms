/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package synchronization;

/**
 *
 * @author Satyanarayana
 */
public class BusTicketBooking{
    
    int total_tickets=10;
    synchronized void BusBooking(int tickets)
    {
        if(total_tickets>=tickets)
        {
            
            System.out.println("ticket  booking successfully");
            total_tickets=total_tickets-tickets;
            System.out.println("available tickets : "+total_tickets);
            
        }
        else
        {
            System.out.println("tickets not booked...");
            System.out.println("avaialable tickets : "+total_tickets);
        }
    }
    
    
    
}
