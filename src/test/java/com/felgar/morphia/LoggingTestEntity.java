package com.felgar.morphia;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;

public class LoggingTestEntity {
    @Id
    private ObjectId id;

    private int i = 5;
}
