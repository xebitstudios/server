package com.onslyde.domain;

// Generated Jun 15, 2012 8:41:06 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Attendee generated by hbm2java
 */
@Entity
@Table(name = "attendee", catalog = "onslyde")
public class Attendee implements java.io.Serializable {

	private Integer id;
	private String ip;
	private String name;
	private String email;
	private String socketId;
	private Date created;
	private Set<SlideGroupVotes> slideGroupVoteses = new HashSet<SlideGroupVotes>(
			0);

	public Attendee() {
	}

	public Attendee(Date created) {
		this.created = created;
	}

	public Attendee(String ip, String name, String email, String socketId,
			Date created, Set<SlideGroupVotes> slideGroupVoteses) {
		this.ip = ip;
		this.name = name;
		this.email = email;
		this.socketId = socketId;
		this.created = created;
		this.slideGroupVoteses = slideGroupVoteses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "ip", length = 20)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "socket_id")
	public String getSocketId() {
		return this.socketId;
	}

	public void setSocketId(String socketId) {
		this.socketId = socketId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", nullable = false, length = 19)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "attendee")
	public Set<SlideGroupVotes> getSlideGroupVoteses() {
		return this.slideGroupVoteses;
	}

	public void setSlideGroupVoteses(Set<SlideGroupVotes> slideGroupVoteses) {
		this.slideGroupVoteses = slideGroupVoteses;
	}

}
