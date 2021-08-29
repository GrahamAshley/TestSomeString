/**
  * Copyright 2021 json.cn 
  */
package com.test.entity;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2021-05-27 13:45:55
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class Info {

    private String status;
    private String com;
    private String state;
    private Date send_time;
    private String departure_city;
    private String arrival_city;
    private String latest_progress;
    private List<Context> context;
    private String _source_com;
    private String _support_from;
    private String isAbstract;
    private String current;
    private String currentStatus;
    private Date latest_time;
    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setCom(String com) {
         this.com = com;
     }
     public String getCom() {
         return com;
     }

    public void setState(String state) {
         this.state = state;
     }
     public String getState() {
         return state;
     }

    public void setSend_time(Date send_time) {
         this.send_time = send_time;
     }
     public Date getSend_time() {
         return send_time;
     }

    public void setDeparture_city(String departure_city) {
         this.departure_city = departure_city;
     }
     public String getDeparture_city() {
         return departure_city;
     }

    public void setArrival_city(String arrival_city) {
         this.arrival_city = arrival_city;
     }
     public String getArrival_city() {
         return arrival_city;
     }

    public void setLatest_progress(String latest_progress) {
         this.latest_progress = latest_progress;
     }
     public String getLatest_progress() {
         return latest_progress;
     }

    public void setContext(List<Context> context) {
         this.context = context;
     }
     public List<Context> getContext() {
         return context;
     }

    public void set_source_com(String _source_com) {
         this._source_com = _source_com;
     }
     public String get_source_com() {
         return _source_com;
     }

    public void set_support_from(String _support_from) {
         this._support_from = _support_from;
     }
     public String get_support_from() {
         return _support_from;
     }

    public void setIsAbstract(String isAbstract) {
         this.isAbstract = isAbstract;
     }
     public String getIsAbstract() {
         return isAbstract;
     }

    public void setCurrent(String current) {
         this.current = current;
     }
     public String getCurrent() {
         return current;
     }

    public void setCurrentStatus(String currentStatus) {
         this.currentStatus = currentStatus;
     }
     public String getCurrentStatus() {
         return currentStatus;
     }

    public void setLatest_time(Date latest_time) {
         this.latest_time = latest_time;
     }
     public Date getLatest_time() {
         return latest_time;
     }

}