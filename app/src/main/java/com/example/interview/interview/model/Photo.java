
package com.example.interview.interview.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Photo {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("camera")
    @Expose
    private Object camera;
    @SerializedName("lens")
    @Expose
    private Object lens;
    @SerializedName("focal_length")
    @Expose
    private Object focalLength;
    @SerializedName("iso")
    @Expose
    private Object iso;
    @SerializedName("shutter_speed")
    @Expose
    private Object shutterSpeed;
    @SerializedName("aperture")
    @Expose
    private Object aperture;
    @SerializedName("times_viewed")
    @Expose
    private Integer timesViewed;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("category")
    @Expose
    private Integer category;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("latitude")
    @Expose
    private Object latitude;
    @SerializedName("longitude")
    @Expose
    private Object longitude;
    @SerializedName("taken_at")
    @Expose
    private Object takenAt;
    @SerializedName("hi_res_uploaded")
    @Expose
    private Integer hiResUploaded;
    @SerializedName("for_sale")
    @Expose
    private Boolean forSale;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("votes_count")
    @Expose
    private Integer votesCount;
    @SerializedName("favorites_count")
    @Expose
    private Integer favoritesCount;
    @SerializedName("comments_count")
    @Expose
    private Integer commentsCount;
    @SerializedName("nsfw")
    @Expose
    private Boolean nsfw;
    @SerializedName("sales_count")
    @Expose
    private Integer salesCount;
    @SerializedName("for_sale_date")
    @Expose
    private Object forSaleDate;
    @SerializedName("highest_rating")
    @Expose
    private Double highestRating;
    @SerializedName("highest_rating_date")
    @Expose
    private Object highestRatingDate;
    @SerializedName("license_type")
    @Expose
    private Integer licenseType;
    @SerializedName("converted")
    @Expose
    private Integer converted;
    @SerializedName("collections_count")
    @Expose
    private Integer collectionsCount;
    @SerializedName("crop_version")
    @Expose
    private Integer cropVersion;
    @SerializedName("privacy")
    @Expose
    private Boolean privacy;
    @SerializedName("profile")
    @Expose
    private Boolean profile;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("positive_votes_count")
    @Expose
    private Integer positiveVotesCount;
    @SerializedName("converted_bits")
    @Expose
    private Integer convertedBits;
    @SerializedName("store_download")
    @Expose
    private Boolean storeDownload;
    @SerializedName("store_print")
    @Expose
    private Boolean storePrint;
    @SerializedName("store_license")
    @Expose
    private Boolean storeLicense;
    @SerializedName("request_to_buy_enabled")
    @Expose
    private Boolean requestToBuyEnabled;
    @SerializedName("license_requests_enabled")
    @Expose
    private Boolean licenseRequestsEnabled;
    @SerializedName("watermark")
    @Expose
    private Boolean watermark;
    @SerializedName("image_format")
    @Expose
    private String imageFormat;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("licensing_requested")
    @Expose
    private Boolean licensingRequested;
    @SerializedName("licensing_suggested")
    @Expose
    private Boolean licensingSuggested;
    @SerializedName("is_free_photo")
    @Expose
    private Boolean isFreePhoto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getCamera() {
        return camera;
    }

    public void setCamera(Object camera) {
        this.camera = camera;
    }

    public Object getLens() {
        return lens;
    }

    public void setLens(Object lens) {
        this.lens = lens;
    }

    public Object getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(Object focalLength) {
        this.focalLength = focalLength;
    }

    public Object getIso() {
        return iso;
    }

    public void setIso(Object iso) {
        this.iso = iso;
    }

    public Object getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(Object shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public Object getAperture() {
        return aperture;
    }

    public void setAperture(Object aperture) {
        this.aperture = aperture;
    }

    public Integer getTimesViewed() {
        return timesViewed;
    }

    public void setTimesViewed(Integer timesViewed) {
        this.timesViewed = timesViewed;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Object getLatitude() {
        return latitude;
    }

    public void setLatitude(Object latitude) {
        this.latitude = latitude;
    }

    public Object getLongitude() {
        return longitude;
    }

    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public Object getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(Object takenAt) {
        this.takenAt = takenAt;
    }

    public Integer getHiResUploaded() {
        return hiResUploaded;
    }

    public void setHiResUploaded(Integer hiResUploaded) {
        this.hiResUploaded = hiResUploaded;
    }

    public Boolean getForSale() {
        return forSale;
    }

    public void setForSale(Boolean forSale) {
        this.forSale = forSale;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getVotesCount() {
        return votesCount;
    }

    public void setVotesCount(Integer votesCount) {
        this.votesCount = votesCount;
    }

    public Integer getFavoritesCount() {
        return favoritesCount;
    }

    public void setFavoritesCount(Integer favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    public Integer getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    public Boolean getNsfw() {
        return nsfw;
    }

    public void setNsfw(Boolean nsfw) {
        this.nsfw = nsfw;
    }

    public Integer getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
    }

    public Object getForSaleDate() {
        return forSaleDate;
    }

    public void setForSaleDate(Object forSaleDate) {
        this.forSaleDate = forSaleDate;
    }

    public Double getHighestRating() {
        return highestRating;
    }

    public void setHighestRating(Double highestRating) {
        this.highestRating = highestRating;
    }

    public Object getHighestRatingDate() {
        return highestRatingDate;
    }

    public void setHighestRatingDate(Object highestRatingDate) {
        this.highestRatingDate = highestRatingDate;
    }

    public Integer getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(Integer licenseType) {
        this.licenseType = licenseType;
    }

    public Integer getConverted() {
        return converted;
    }

    public void setConverted(Integer converted) {
        this.converted = converted;
    }

    public Integer getCollectionsCount() {
        return collectionsCount;
    }

    public void setCollectionsCount(Integer collectionsCount) {
        this.collectionsCount = collectionsCount;
    }

    public Integer getCropVersion() {
        return cropVersion;
    }

    public void setCropVersion(Integer cropVersion) {
        this.cropVersion = cropVersion;
    }

    public Boolean getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Boolean privacy) {
        this.privacy = privacy;
    }

    public Boolean getProfile() {
        return profile;
    }

    public void setProfile(Boolean profile) {
        this.profile = profile;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPositiveVotesCount() {
        return positiveVotesCount;
    }

    public void setPositiveVotesCount(Integer positiveVotesCount) {
        this.positiveVotesCount = positiveVotesCount;
    }

    public Integer getConvertedBits() {
        return convertedBits;
    }

    public void setConvertedBits(Integer convertedBits) {
        this.convertedBits = convertedBits;
    }

    public Boolean getStoreDownload() {
        return storeDownload;
    }

    public void setStoreDownload(Boolean storeDownload) {
        this.storeDownload = storeDownload;
    }

    public Boolean getStorePrint() {
        return storePrint;
    }

    public void setStorePrint(Boolean storePrint) {
        this.storePrint = storePrint;
    }

    public Boolean getStoreLicense() {
        return storeLicense;
    }

    public void setStoreLicense(Boolean storeLicense) {
        this.storeLicense = storeLicense;
    }

    public Boolean getRequestToBuyEnabled() {
        return requestToBuyEnabled;
    }

    public void setRequestToBuyEnabled(Boolean requestToBuyEnabled) {
        this.requestToBuyEnabled = requestToBuyEnabled;
    }

    public Boolean getLicenseRequestsEnabled() {
        return licenseRequestsEnabled;
    }

    public void setLicenseRequestsEnabled(Boolean licenseRequestsEnabled) {
        this.licenseRequestsEnabled = licenseRequestsEnabled;
    }

    public Boolean getWatermark() {
        return watermark;
    }

    public void setWatermark(Boolean watermark) {
        this.watermark = watermark;
    }

    public String getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean getLicensingRequested() {
        return licensingRequested;
    }

    public void setLicensingRequested(Boolean licensingRequested) {
        this.licensingRequested = licensingRequested;
    }

    public Boolean getLicensingSuggested() {
        return licensingSuggested;
    }

    public void setLicensingSuggested(Boolean licensingSuggested) {
        this.licensingSuggested = licensingSuggested;
    }

    public Boolean getIsFreePhoto() {
        return isFreePhoto;
    }

    public void setIsFreePhoto(Boolean isFreePhoto) {
        this.isFreePhoto = isFreePhoto;
    }

}
