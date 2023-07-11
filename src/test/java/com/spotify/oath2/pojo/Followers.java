
package com.spotify.oath2.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)


public class Followers {

    private Object href;
    
    private Integer total;

   
    public Object getHref() {
        return href;
    }

   
    public void setHref(Object href) {
        this.href = href;
    }

    
    public Integer getTotal() {
        return total;
    }

 
    public void setTotal(Integer total) {
        this.total = total;
    }

}
