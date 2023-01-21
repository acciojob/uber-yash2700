package com.driver.model;

import javax.persistence.Table;

@Table(name = "tripstatus")
public enum TripStatus {
    CONFIRMED,CANCELED,COMPLETED
}
