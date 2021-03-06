package domain.entity;

import java.util.Date;

/**
 * Билет.
 *
 *
 *
 *
 */
public class Ticket extends Entity {

    /**
     * Дата бронирования.
     */
    private Date dateOfBooking;

    /**
     * Продолжительность бронирования.
     */
    private Long durationOfBooking;

    /**
     * Клиент операции.
     */
    private Client transactionClient;

    /**
     * Забронирован?
     */
    private Boolean isBooked;
}
