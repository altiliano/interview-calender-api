package rest.api.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

/**
 * Created by Afonseca on 15/01/2023.
 **/
public class AvailabilityRest implements Serializable {

    @Serial
    private static final long serialVersionUID = 267939876266558056L;
    private Date day;
    private LocalTime startTime;
    private LocalTime finishTime;

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalTime finishTime) {
        this.finishTime = finishTime;
    }

}
