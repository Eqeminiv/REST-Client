package client;

import java.sql.Timestamp;
import java.util.UUID;

public class uuid {

    private UUID hash;
    private Timestamp date;

    public UUID getHash() {
        return hash;
    }

    public void setHash(UUID hash) {
        this.hash = hash;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public uuid()
    {
        hash = UUID.randomUUID();
        date = new Timestamp(System.currentTimeMillis());
    }

}
