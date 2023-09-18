package br.com.primeirapi.handler;

import java.util.Date;

public class ResponseError {
    private Date timesTemp=new Date();
    private String status="error";
    private int statusCode=400;
    private String erro;

    public Date getTimesTemp() {
        return timesTemp;
    }

    public void setTimesTemp(Date timesTemp) {
        this.timesTemp = timesTemp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }
}
