package Model;

public class ResponseModel {
   private String msg,status,comments;

    public ResponseModel(String msg, String status, String comments) {
        this.msg = msg;
        this.status = status;
        this.comments = comments;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    public ResponseModel(){

    }
}
