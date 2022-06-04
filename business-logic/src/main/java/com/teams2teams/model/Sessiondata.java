package com.teams2teams.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sessiondata {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private java.sql.Timestamp sqlTimestamp;
    private long userId;
    private UUID sessionId;

    

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
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
