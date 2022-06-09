package com.teams2teams.model;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sessiondata {
    
    @Id
    private UUID sessionId;
    private java.sql.Timestamp sqlTimestamp;
    private long userId;
    
    public Sessiondata(UUID sessionId, Timestamp sqlTimestamp, long userId) {
        this.sessionId = sessionId;
        this.sqlTimestamp = sqlTimestamp;
        this.userId = userId;
    }
    /**
     * @return java.sql.Timestamp return the sqlTimestamp
     */
    public java.sql.Timestamp getSqlTimestamp() {
        return sqlTimestamp;
    }

    /**
     * @param sqlTimestamp the sqlTimestamp to set
     */
    public void setSqlTimestamp(java.sql.Timestamp sqlTimestamp) {
        this.sqlTimestamp = sqlTimestamp;
    }

    /**
     * @return long return the userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * @return UUID return the sessionId
     */
    public UUID getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId the sessionId to set
     */
    public void setSessionId(UUID sessionId) {
        this.sessionId = sessionId;
    }

}
