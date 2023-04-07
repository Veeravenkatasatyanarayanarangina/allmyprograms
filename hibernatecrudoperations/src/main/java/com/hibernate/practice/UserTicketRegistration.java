package com.hibernate.practice;

import com.hibernate.practice.dao.TicktsDao;
import com.hibernate.practice.model.TicketDetails;

public class UserTicketRegistration
{
    public static void main(String[] args) {
        TicktsDao ticktsDao = new TicktsDao();
        TicketDetails ticketDetails = new TicketDetails();
        ticketDetails.setTid("AB123");
        ticketDetails.setName("Satya");
        ticketDetails.setAge("23");
        ticketDetails.setMailId("satya@gmail.com");
        ticktsDao.saveTicketDetails(ticketDetails);
        System.out.println("success");
    }
}
