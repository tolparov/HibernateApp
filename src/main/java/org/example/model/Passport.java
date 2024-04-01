package org.example.model;

import jakarta.persistence.*;

import javax.xml.namespace.QName;
import java.io.Serializable;

@Entity
@Table(name = "Passport")
public class Passport {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name = "person_id", referencedColumnName = "id")
	private Person person;
	@Column(name = "passport_number")
	private int passport_number;

	public Passport() {
	}

	public Passport(int passport_number) {
		this.passport_number = passport_number;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPassport_number() {
		return passport_number;
	}

	public void setPassport_number(int passport_number) {
		this.passport_number = passport_number;
	}

	@Override
	public String toString() {
		return "Passport{" +
				"person=" + person +
				", passport_number=" + passport_number +
				'}';
	}
}
