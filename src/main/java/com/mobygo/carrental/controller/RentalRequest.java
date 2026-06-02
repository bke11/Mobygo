package com.mobygo.carrental.controller;

import java.time.LocalDate;

public class RentalRequest {
    private Long carId;
    private Long pickupLocationId;
    private Long dropoffLocationId;
    private Long userId;
    private LocalDate startDate;
    private LocalDate endDate;

    public Long getCarId() { return carId; }
    public void setCarId(Long carId) { this.carId = carId; }

    public Long getPickupLocationId() { return pickupLocationId; }
    public void setPickupLocationId(Long pickupLocationId) { this.pickupLocationId = pickupLocationId; }

    public Long getDropoffLocationId() { return dropoffLocationId; }
    public void setDropoffLocationId(Long dropoffLocationId) { this.dropoffLocationId = dropoffLocationId; }

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }
}
