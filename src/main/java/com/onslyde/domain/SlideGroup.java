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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SlideGroup generated by hbm2java
 */
@Entity
@Table(name = "slide_group", catalog = "onslyde")
public class SlideGroup implements java.io.Serializable {

	private Integer id;
	private Session session;
	private String groupName;
	private Date created;
	private Set<Slide> slides = new HashSet<Slide>(0);
	private Set<SlideGroupVotes> slideGroupVoteses = new HashSet<SlideGroupVotes>(
			0);
	private Set<SlideGroupOptions> slideGroupOptionses = new HashSet<SlideGroupOptions>(
			0);

	public SlideGroup() {
	}

	public SlideGroup(Session session, String groupName, Date created) {
		this.session = session;
		this.groupName = groupName;
		this.created = created;
	}

	public SlideGroup(Session session, String groupName, Date created,
			Set<Slide> slides, Set<SlideGroupVotes> slideGroupVoteses,
			Set<SlideGroupOptions> slideGroupOptionses) {
		this.session = session;
		this.groupName = groupName;
		this.created = created;
		this.slides = slides;
		this.slideGroupVoteses = slideGroupVoteses;
		this.slideGroupOptionses = slideGroupOptionses;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "session_id", nullable = false)
	public Session getSession() {
		return this.session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	@Column(name = "group_name", nullable = false)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", nullable = false, length = 19)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slideGroup")
	public Set<Slide> getSlides() {
		return this.slides;
	}

	public void setSlides(Set<Slide> slides) {
		this.slides = slides;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slideGroup")
	public Set<SlideGroupVotes> getSlideGroupVoteses() {
		return this.slideGroupVoteses;
	}

	public void setSlideGroupVoteses(Set<SlideGroupVotes> slideGroupVoteses) {
		this.slideGroupVoteses = slideGroupVoteses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slideGroup")
	public Set<SlideGroupOptions> getSlideGroupOptionses() {
		return this.slideGroupOptionses;
	}

	public void setSlideGroupOptionses(
			Set<SlideGroupOptions> slideGroupOptionses) {
		this.slideGroupOptionses = slideGroupOptionses;
	}

}
