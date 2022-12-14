package _crwaling.domain;

import java.time.LocalDateTime;


public class ygosu {

    private String no;
    private double readCnt;
    private double commentCnt; 
    private LocalDateTime dateTime;
    private double voteCnt;

    
    public String getNo(){
        return this.no;
    }


    public double getReadCnt() {
        return readCnt;
    }


    public double getCommentCnt() {
        return commentCnt;
    }


    public LocalDateTime getDateTime() {
        return dateTime;
    }


    public double getVoteCnt() {
        return voteCnt;
    }

    
}
