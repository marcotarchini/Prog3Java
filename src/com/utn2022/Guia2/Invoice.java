package com.utn2022.Guia2;

import com.utn2022.Guia2.Customer;
import com.utn2022.Guia2.Information;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.UUID;


public class Invoice {

    private UUID idInvoice;
    private Information[] items;
    private LocalDateTime date;
    private Customer customer;

    public Invoice(double totalAmount, LocalDateTime date, Customer customer) {
        this.idInvoice=UUID.randomUUID();
        this.items = items;
        this.date = LocalDateTime.now();
        this.customer = customer;
    }

    public double getMontoTotal() {
        double total = 0.0;
        for (Information itemVenta : items) {
            if (itemVenta != null) {
                total += itemVenta.getTotal();
            }
        }
        return total - (total * (customer.getDiscount() / 100));
    }

    public UUID getIdInvoice() {
        return idInvoice;
    }

    public Information[] getItems() {
        return items;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "idInvoice=" + idInvoice +
                ", items=" + Arrays.toString(items) +
                ", date=" + date +
                ", customer=" + customer +
                '}';
    }
}
