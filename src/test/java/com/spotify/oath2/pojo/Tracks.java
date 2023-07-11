
package com.spotify.oath2.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)


public class Tracks {

    
    private String href;
   
    private List<Object> items;
    
    private Integer limit;
    
    private Object next;
    
    private Integer offset;
    
    private Object previous;
    
    private Integer total;

   
    public String getHref() {
        return href;
    }

   
    public void setHref(String href) {
        this.href = href;
    }

    
    public List<Object> getItems() {
        return items;
    }

    
    public void setItems(List<Object> items) {
        this.items = items;
    }

    
    public Integer getLimit() {
        return limit;
    }

    
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

   
    public Object getNext() {
        return next;
    }

    
    public void setNext(Object next) {
        this.next = next;
    }

  
    public Integer getOffset() {
        return offset;
    }

  
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    
    public Object getPrevious() {
        return previous;
    }

    
    public void setPrevious(Object previous) {
        this.previous = previous;
    }

   
    public Integer getTotal() {
        return total;
    }

    
    public void setTotal(Integer total) {
        this.total = total;
    }

}
