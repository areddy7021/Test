package com.uhc.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
//@Entity
@Immutable
//@Table(name = "STG_ELIGIBILITY_SECURITY", schema = "eim")
public class EligibilitySecurity {

	@Column(name = "PERMISSION")
	private String permission;

	@Column(name = "SRC_SYS")
	private String srcSys;

}
