package in.co.biddingservice.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="APP_PRODUCT")
public class Product implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column(name="PRODUCT_NAME", nullable=false)
	private String product_name;

	@Column(name="IMAGE_URL", nullable=false)
	private String image_url;

	@Column(name="BID_TIME", nullable=false)
	private String bid_time;

	@Column(name="BID_TIME_FORMAT", nullable=false)
	private String bid_time_format;
	
	@Column(name="BID_PRICE", nullable=false)
	private String bid_price;

	@Column(name="BID_STATUS", nullable=false)
	private String bid_status;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getBid_time() {
		return bid_time;
	}

	public void setBid_time(String bid_time) {
		this.bid_time = bid_time;
	}

	public String getBid_time_format() {
		return bid_time_format;
	}

	public void setBid_time_format(String bid_time_format) {
		this.bid_time_format = bid_time_format;
	}

	public String getBid_price() {
		return bid_price;
	}

	public void setBid_price(String bid_price) {
		this.bid_price = bid_price;
	}

	public String getBid_status() {
		return bid_status;
	}

	public void setBid_status(String bid_status) {
		this.bid_status = bid_status;
	}


}
