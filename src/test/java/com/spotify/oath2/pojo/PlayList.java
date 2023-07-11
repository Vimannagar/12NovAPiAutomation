
package com.spotify.oath2.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)


public class PlayList {

  
    private Boolean collaborative;
   
    private String description;
   
    private ExternalUrls externalUrls;
    
    private Followers followers;
   
    private String href;
    
    private String id;
   
    private List<Object> images;
    
    private String name;
   
    private Owner owner;
   
    private Object primaryColor;
   
    private Boolean _public;
   
    private String snapshotId;
   
    private Tracks tracks;
   
    private String type;
    
    private String uri;

    
    public Boolean getCollaborative() {
        return collaborative;
    }

   
    public void setCollaborative(Boolean collaborative) {
        this.collaborative = collaborative;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }

    
    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    
    public void setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
    }

   
    public Followers getFollowers() {
        return followers;
    }

   
    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    
    public String getHref() {
        return href;
    }

   
    public void setHref(String href) {
        this.href = href;
    }

   
    public String getId() {
        return id;
    }

   
    public void setId(String id) {
        this.id = id;
    }

   
    public List<Object> getImages() {
        return images;
    }

    
    public void setImages(List<Object> images) {
        this.images = images;
    }

  
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    
    public Owner getOwner() {
        return owner;
    }

   
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    
    public Object getPrimaryColor() {
        return primaryColor;
    }

   
    public void setPrimaryColor(Object primaryColor) {
        this.primaryColor = primaryColor;
    }

    
    public Boolean getPublic() {
        return _public;
    }

    
    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    
    public String getSnapshotId() {
        return snapshotId;
    }

    
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

  
    public Tracks getTracks() {
        return tracks;
    }

    
    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    
    public String getType() {
        return type;
    }

    
    public void setType(String type) {
        this.type = type;
    }

    
    public String getUri() {
        return uri;
    }

    
    public void setUri(String uri) {
        this.uri = uri;
    }

}
